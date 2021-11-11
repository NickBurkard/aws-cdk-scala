package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionProperty {

  def apply(
    targetGroupArn: Option[String] = None,
    authenticateCognitoConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty] = None,
    fixedResponseConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty] = None,
    forwardConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty] = None,
    order: Option[Number] = None,
    `type`: Option[String] = None,
    redirectConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty] = None,
    authenticateOidcConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty.Builder)
      .targetGroupArn(targetGroupArn.orNull)
      .authenticateCognitoConfig(authenticateCognitoConfig.orNull)
      .fixedResponseConfig(fixedResponseConfig.orNull)
      .forwardConfig(forwardConfig.orNull)
      .order(order.orNull)
      .`type`(`type`.orNull)
      .redirectConfig(redirectConfig.orNull)
      .authenticateOidcConfig(authenticateOidcConfig.orNull)
      .build()
}
