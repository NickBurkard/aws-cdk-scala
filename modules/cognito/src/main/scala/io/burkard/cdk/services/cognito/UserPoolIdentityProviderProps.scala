package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolIdentityProviderProps {

  def apply(
    userPool: software.amazon.awscdk.services.cognito.IUserPool,
    attributeMapping: Option[software.amazon.awscdk.services.cognito.AttributeMapping] = None
  ): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps =
    (new software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps.Builder)
      .userPool(userPool)
      .attributeMapping(attributeMapping.orNull)
      .build()
}
