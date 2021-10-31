package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPoolIdentityProviderAppleProps {

  def apply(
    clientId: Option[String] = None,
    teamId: Option[String] = None,
    attributeMapping: Option[software.amazon.awscdk.services.cognito.AttributeMapping] = None,
    scopes: Option[List[String]] = None,
    keyId: Option[String] = None,
    privateKey: Option[String] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  ): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps =
    (new software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps.Builder)
      .clientId(clientId.orNull)
      .teamId(teamId.orNull)
      .attributeMapping(attributeMapping.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .keyId(keyId.orNull)
      .privateKey(privateKey.orNull)
      .userPool(userPool.orNull)
      .build()
}
