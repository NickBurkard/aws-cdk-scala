package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolDomainProps {

  def apply(
    domain: String,
    userPoolId: String,
    customDomainConfig: Option[software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps.Builder)
      .domain(domain)
      .userPoolId(userPoolId)
      .customDomainConfig(customDomainConfig.orNull)
      .build()
}
