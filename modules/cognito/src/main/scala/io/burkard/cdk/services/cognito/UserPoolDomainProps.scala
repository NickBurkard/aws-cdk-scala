package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolDomainProps {

  def apply(
    userPool: software.amazon.awscdk.services.cognito.IUserPool,
    cognitoDomain: Option[software.amazon.awscdk.services.cognito.CognitoDomainOptions] = None,
    customDomain: Option[software.amazon.awscdk.services.cognito.CustomDomainOptions] = None
  ): software.amazon.awscdk.services.cognito.UserPoolDomainProps =
    (new software.amazon.awscdk.services.cognito.UserPoolDomainProps.Builder)
      .userPool(userPool)
      .cognitoDomain(cognitoDomain.orNull)
      .customDomain(customDomain.orNull)
      .build()
}
