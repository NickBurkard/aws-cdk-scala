package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolDomainOptions {

  def apply(
    cognitoDomain: Option[software.amazon.awscdk.services.cognito.CognitoDomainOptions] = None,
    customDomain: Option[software.amazon.awscdk.services.cognito.CustomDomainOptions] = None
  ): software.amazon.awscdk.services.cognito.UserPoolDomainOptions =
    (new software.amazon.awscdk.services.cognito.UserPoolDomainOptions.Builder)
      .cognitoDomain(cognitoDomain.orNull)
      .customDomain(customDomain.orNull)
      .build()
}
