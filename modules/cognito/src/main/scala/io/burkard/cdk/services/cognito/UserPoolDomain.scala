package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolDomain {

  def apply(
    internalResourceId: String,
    userPool: software.amazon.awscdk.services.cognito.IUserPool,
    cognitoDomain: Option[software.amazon.awscdk.services.cognito.CognitoDomainOptions] = None,
    customDomain: Option[software.amazon.awscdk.services.cognito.CustomDomainOptions] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.UserPoolDomain =
    software.amazon.awscdk.services.cognito.UserPoolDomain.Builder
      .create(stackCtx, internalResourceId)
      .userPool(userPool)
      .cognitoDomain(cognitoDomain.orNull)
      .customDomain(customDomain.orNull)
      .build()
}
