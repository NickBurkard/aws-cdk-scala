package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPoolIdentityProviderAmazonProps {

  def apply(
    clientId: Option[String] = None,
    attributeMapping: Option[software.amazon.awscdk.services.cognito.AttributeMapping] = None,
    scopes: Option[List[String]] = None,
    clientSecret: Option[String] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  ): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps =
    (new software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps.Builder)
      .clientId(clientId.orNull)
      .attributeMapping(attributeMapping.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .clientSecret(clientSecret.orNull)
      .userPool(userPool.orNull)
      .build()
}
