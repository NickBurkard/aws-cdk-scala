package io.burkard.cdk.services.lambda

sealed abstract class Tracing(val underlying: software.amazon.awscdk.services.lambda.Tracing)
  extends Product
    with Serializable

object Tracing {
  implicit def toAws(value: Tracing): software.amazon.awscdk.services.lambda.Tracing =
    Option(value).map(_.underlying).orNull

  case object Active
    extends Tracing(software.amazon.awscdk.services.lambda.Tracing.ACTIVE)

  case object Disabled
    extends Tracing(software.amazon.awscdk.services.lambda.Tracing.DISABLED)

  case object PassThrough
    extends Tracing(software.amazon.awscdk.services.lambda.Tracing.PASS_THROUGH)
}
