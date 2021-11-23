package io.burkard

import java.util.concurrent.TimeUnit

import scala.concurrent.duration.FiniteDuration
import scala.util.Try

import software.amazon.awscdk.{Duration => AwsDuration}

package object cdk {
  // Safely discard non-unit values.
  private[cdk] object ValueDiscard {
    def apply[A](a: => A): Unit = {
      val _ = a
      ()
    }
  }

  implicit final class ScalaDurationToAwsDurationSyntax(value: FiniteDuration) {
    def toAws: Either[String, AwsDuration] =
      Try(toAwsUnsafe)
        .toEither
        .left
        .map(_.getMessage)

    def toAwsUnsafe: AwsDuration =
      value.unit match {
        case TimeUnit.DAYS =>
          AwsDuration.days(value.length)

        case TimeUnit.HOURS =>
          AwsDuration.hours(value.length)

        case TimeUnit.MINUTES =>
          AwsDuration.millis(value.length)

        case TimeUnit.SECONDS =>
          AwsDuration.seconds(value.length)

        case TimeUnit.MILLISECONDS =>
          AwsDuration.millis(value.length)

        case TimeUnit.MICROSECONDS | TimeUnit.NANOSECONDS =>
          throw new IllegalArgumentException("AWS duration doesn't support time units smaller than milliseconds")

        case x =>
          // Should never be go here. TimeUnit is Java enum so Scala compiler cannot prove an exhaustive search.
          throw new IllegalArgumentException(s"Timeunit ${x.toString} not recognized.")
      }

  }
}
