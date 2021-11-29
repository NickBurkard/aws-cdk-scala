package io.burkard

import java.util.concurrent.TimeUnit
import java.util.{Map => JMap}
import scala.util.Try

import scala.annotation.nowarn
import scala.concurrent.duration.FiniteDuration
import scala.collection.JavaConverters._

import software.amazon.awscdk.{Duration => AwsDuration}

import io.burkard.cdk.metadata._

package object cdk {
  // Safely discard non-unit values.
  private[cdk] object ValueDiscard {
    def apply[A](a: => A): Unit = {
      val _ = a
      ()
    }
  }

  implicit final class ScalaDurationToAwsDurationSyntax(private val value: FiniteDuration) extends AnyVal {
    def toAws: Either[String, AwsDuration] =
      Try(toAwsUnsafe)
        .toEither
        .left
        .map {
          case _: MatchError =>
            // Should never reach here. TimeUnit is Java enum so Scala compiler cannot prove an exhaustive search.
            s"Timeunit, ${value.unit.toString}, not recognized."

          case t =>
            t.getMessage
        }

    def toAwsUnsafe: AwsDuration =
      value.unit match {
        case TimeUnit.DAYS =>
          AwsDuration.days(value.length)

        case TimeUnit.HOURS =>
          AwsDuration.hours(value.length)

        case TimeUnit.MINUTES =>
          AwsDuration.minutes(value.length)

        case TimeUnit.SECONDS =>
          AwsDuration.seconds(value.length)

        case TimeUnit.MILLISECONDS =>
          AwsDuration.millis(value.length)

        case TimeUnit.MICROSECONDS | TimeUnit.NANOSECONDS =>
          throw new IllegalArgumentException("AWS duration doesn't support time units smaller than milliseconds")

        // Scala 3 compiler dismisses `case _ =>` checks and forces `case null =>`. Should never reach this case.
        case null =>
          throw new IllegalArgumentException("Quirk in Scala 3 compiler. FiniteDuration calls `require` with not null on timeunit values, but compiler doesn't see this.")
      }
  }

  private[cdk] final implicit class JMapEncoderOps[A](private val value: A) extends AnyVal {
    def encode(implicit encoder: JMapEncoder[A]): JMap[String, AnyRef] =
      encoder.encode(value)
  }

  private[this] val awsCloudFormationInterfaceKey = "AWS::CloudFormation::Interface"

  @nowarn("cat=deprecation")
  final implicit class StackOps(private val stack: software.amazon.awscdk.Stack) extends AnyVal {
    /**
     * Set a CloudFormation interface in the stack's metadata.
     * Will overwrite a previously set CloudFormation interface if present.
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-interface.html
     *
     * @param cloudFormationInterface CloudFormation interface.
     */
    def setCloudFormationInterface(cloudFormationInterface: CloudFormationInterface): Unit =
      Option(stack.getTemplateOptions.getMetadata) match {
        case Some(metadata) =>
          val _ = metadata.put(awsCloudFormationInterfaceKey, cloudFormationInterface.encode)

        case None =>
          stack.getTemplateOptions.setMetadata(
            Map[String, AnyRef](awsCloudFormationInterfaceKey -> cloudFormationInterface.encode).asJava
          )
      }
  }
}
