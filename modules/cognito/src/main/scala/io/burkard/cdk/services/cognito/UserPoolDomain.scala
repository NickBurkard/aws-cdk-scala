package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolDomain {

  def apply(
    internalResourceId: String,
    cognitoDomain: Option[software.amazon.awscdk.services.cognito.CognitoDomainOptions] = None,
    customDomain: Option[software.amazon.awscdk.services.cognito.CustomDomainOptions] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.UserPoolDomain =
    software.amazon.awscdk.services.cognito.UserPoolDomain.Builder
      .create(stackCtx, internalResourceId)
      .cognitoDomain(cognitoDomain.orNull)
      .customDomain(customDomain.orNull)
      .userPool(userPool.orNull)
      .build()
}
