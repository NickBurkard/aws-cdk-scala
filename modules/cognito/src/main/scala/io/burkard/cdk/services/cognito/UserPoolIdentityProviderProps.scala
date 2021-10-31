package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolIdentityProviderProps {

  def apply(
    attributeMapping: Option[software.amazon.awscdk.services.cognito.AttributeMapping] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  ): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps =
    (new software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps.Builder)
      .attributeMapping(attributeMapping.orNull)
      .userPool(userPool.orNull)
      .build()
}
