package io.burkard.cdk.services.autoscaling


sealed abstract class DefaultResult(val underlying: software.amazon.awscdk.services.autoscaling.DefaultResult)
  extends Product
    with Serializable


object DefaultResult {
  implicit def toAws(value: DefaultResult): software.amazon.awscdk.services.autoscaling.DefaultResult =
    Option(value).map(_.underlying).orNull

  case object Continue
    extends DefaultResult(software.amazon.awscdk.services.autoscaling.DefaultResult.CONTINUE)

  case object Abandon
    extends DefaultResult(software.amazon.awscdk.services.autoscaling.DefaultResult.ABANDON)
}
