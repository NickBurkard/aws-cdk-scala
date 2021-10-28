package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPoolIdentityProviderFacebookProps {

  def apply(
    clientId: Option[String] = None,
    attributeMapping: Option[software.amazon.awscdk.services.cognito.AttributeMapping] = None,
    scopes: Option[List[String]] = None,
    clientSecret: Option[String] = None,
    apiVersion: Option[String] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  ): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps =
    (new software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps.Builder)
      .clientId(clientId.orNull)
      .attributeMapping(attributeMapping.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .clientSecret(clientSecret.orNull)
      .apiVersion(apiVersion.orNull)
      .userPool(userPool.orNull)
      .build()
}
