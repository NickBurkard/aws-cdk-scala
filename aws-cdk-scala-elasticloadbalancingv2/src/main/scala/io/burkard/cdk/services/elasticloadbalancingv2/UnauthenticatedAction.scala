package io.burkard.cdk.services.elasticloadbalancingv2

sealed abstract class UnauthenticatedAction(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction)
  extends Product
    with Serializable

object UnauthenticatedAction {
  implicit def toAws(value: UnauthenticatedAction): software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction =
    Option(value).map(_.underlying).orNull

  case object Deny
    extends UnauthenticatedAction(software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction.DENY)

  case object Allow
    extends UnauthenticatedAction(software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction.ALLOW)

  case object Authenticate
    extends UnauthenticatedAction(software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction.AUTHENTICATE)
}
