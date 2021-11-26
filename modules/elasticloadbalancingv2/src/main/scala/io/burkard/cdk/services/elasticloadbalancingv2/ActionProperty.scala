package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionProperty {

  def apply(
    `type`: String,
    targetGroupArn: Option[String] = None,
    authenticateCognitoConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty] = None,
    fixedResponseConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty] = None,
    forwardConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty] = None,
    order: Option[Number] = None,
    redirectConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty] = None,
    authenticateOidcConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty.Builder)
      .`type`(`type`)
      .targetGroupArn(targetGroupArn.orNull)
      .authenticateCognitoConfig(authenticateCognitoConfig.orNull)
      .fixedResponseConfig(fixedResponseConfig.orNull)
      .forwardConfig(forwardConfig.orNull)
      .order(order.orNull)
      .redirectConfig(redirectConfig.orNull)
      .authenticateOidcConfig(authenticateOidcConfig.orNull)
      .build()
}
