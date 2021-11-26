package io.burkard

import java.util.{Map => JMap}

import scala.annotation.nowarn
import scala.collection.JavaConverters._

import io.burkard.cdk.metadata._

package object cdk {
  // Safely discard non-unit values.
  private[cdk] object ValueDiscard {
    def apply[A](a: => A): Unit = {
      val _ = a
      ()
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
