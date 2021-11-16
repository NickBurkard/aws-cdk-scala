package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolIdentityProviderAppleProps {

  def apply(
    clientId: String,
    teamId: String,
    keyId: String,
    privateKey: String,
    attributeMapping: Option[software.amazon.awscdk.services.cognito.AttributeMapping] = None,
    scopes: Option[List[String]] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  ): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps =
    (new software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps.Builder)
      .clientId(clientId)
      .teamId(teamId)
      .keyId(keyId)
      .privateKey(privateKey)
      .attributeMapping(attributeMapping.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .userPool(userPool.orNull)
      .build()
}
