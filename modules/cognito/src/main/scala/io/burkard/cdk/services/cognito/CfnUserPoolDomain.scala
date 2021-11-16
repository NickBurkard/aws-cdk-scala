package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolDomain {

  def apply(
    internalResourceId: String,
    domain: String,
    userPoolId: String,
    customDomainConfig: Option[software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolDomain =
    software.amazon.awscdk.services.cognito.CfnUserPoolDomain.Builder
      .create(stackCtx, internalResourceId)
      .domain(domain)
      .userPoolId(userPoolId)
      .customDomainConfig(customDomainConfig.orNull)
      .build()
}
