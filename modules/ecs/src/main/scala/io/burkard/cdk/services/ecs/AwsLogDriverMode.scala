package io.burkard.cdk.services.ecs


sealed abstract class AwsLogDriverMode(val underlying: software.amazon.awscdk.services.ecs.AwsLogDriverMode)
  extends Product
    with Serializable


object AwsLogDriverMode {
  implicit def toAws(value: AwsLogDriverMode): software.amazon.awscdk.services.ecs.AwsLogDriverMode =
    Option(value).map(_.underlying).orNull

  case object Blocking
    extends AwsLogDriverMode(software.amazon.awscdk.services.ecs.AwsLogDriverMode.BLOCKING)

  case object NonBlocking
    extends AwsLogDriverMode(software.amazon.awscdk.services.ecs.AwsLogDriverMode.NON_BLOCKING)
}
