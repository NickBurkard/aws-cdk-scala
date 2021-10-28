package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPoolIdentityProviderFacebook {

  def apply(
    internalResourceId: String,
    clientId: Option[String] = None,
    attributeMapping: Option[software.amazon.awscdk.services.cognito.AttributeMapping] = None,
    scopes: Option[List[String]] = None,
    clientSecret: Option[String] = None,
    apiVersion: Option[String] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook =
    software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook.Builder
      .create(stackCtx, internalResourceId)
      .clientId(clientId.orNull)
      .attributeMapping(attributeMapping.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .clientSecret(clientSecret.orNull)
      .apiVersion(apiVersion.orNull)
      .userPool(userPool.orNull)
      .build()
}
