package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolIdentityProviderFacebookProps {

  def apply(
    clientId: String,
    clientSecret: String,
    attributeMapping: Option[software.amazon.awscdk.services.cognito.AttributeMapping] = None,
    scopes: Option[List[String]] = None,
    apiVersion: Option[String] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  ): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps =
    (new software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps.Builder)
      .clientId(clientId)
      .clientSecret(clientSecret)
      .attributeMapping(attributeMapping.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .apiVersion(apiVersion.orNull)
      .userPool(userPool.orNull)
      .build()
}
