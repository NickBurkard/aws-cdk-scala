package io.burkard.cdk.services.apigateway

sealed abstract class PassthroughBehavior(val underlying: software.amazon.awscdk.services.apigateway.PassthroughBehavior)
  extends Product
    with Serializable

object PassthroughBehavior {
  implicit def toAws(value: PassthroughBehavior): software.amazon.awscdk.services.apigateway.PassthroughBehavior =
    Option(value).map(_.underlying).orNull

  case object Never
    extends PassthroughBehavior(software.amazon.awscdk.services.apigateway.PassthroughBehavior.NEVER)

  case object WhenNoMatch
    extends PassthroughBehavior(software.amazon.awscdk.services.apigateway.PassthroughBehavior.WHEN_NO_MATCH)

  case object WhenNoTemplates
    extends PassthroughBehavior(software.amazon.awscdk.services.apigateway.PassthroughBehavior.WHEN_NO_TEMPLATES)
}
