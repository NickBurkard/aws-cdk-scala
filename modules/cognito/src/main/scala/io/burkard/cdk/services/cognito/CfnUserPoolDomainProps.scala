package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolDomainProps {

  def apply(
    domain: Option[String] = None,
    customDomainConfig: Option[software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty] = None,
    userPoolId: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps.Builder)
      .domain(domain.orNull)
      .customDomainConfig(customDomainConfig.orNull)
      .userPoolId(userPoolId.orNull)
      .build()
}
