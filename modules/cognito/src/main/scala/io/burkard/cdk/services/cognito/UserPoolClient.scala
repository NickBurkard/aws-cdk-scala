package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPoolClient {

  def apply(
    internalResourceId: String,
    accessTokenValidity: Option[software.amazon.awscdk.Duration] = None,
    preventUserExistenceErrors: Option[Boolean] = None,
    oAuth: Option[software.amazon.awscdk.services.cognito.OAuthSettings] = None,
    disableOAuth: Option[Boolean] = None,
    enableTokenRevocation: Option[Boolean] = None,
    refreshTokenValidity: Option[software.amazon.awscdk.Duration] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None,
    supportedIdentityProviders: Option[List[_ <: software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider]] = None,
    writeAttributes: Option[software.amazon.awscdk.services.cognito.ClientAttributes] = None,
    userPoolClientName: Option[String] = None,
    idTokenValidity: Option[software.amazon.awscdk.Duration] = None,
    generateSecret: Option[Boolean] = None,
    authFlows: Option[software.amazon.awscdk.services.cognito.AuthFlow] = None,
    readAttributes: Option[software.amazon.awscdk.services.cognito.ClientAttributes] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.UserPoolClient =
    software.amazon.awscdk.services.cognito.UserPoolClient.Builder
      .create(stackCtx, internalResourceId)
      .accessTokenValidity(accessTokenValidity.orNull)
      .preventUserExistenceErrors(preventUserExistenceErrors.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .oAuth(oAuth.orNull)
      .disableOAuth(disableOAuth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableTokenRevocation(enableTokenRevocation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .refreshTokenValidity(refreshTokenValidity.orNull)
      .userPool(userPool.orNull)
      .supportedIdentityProviders(supportedIdentityProviders.map(_.asJava).orNull)
      .writeAttributes(writeAttributes.orNull)
      .userPoolClientName(userPoolClientName.orNull)
      .idTokenValidity(idTokenValidity.orNull)
      .generateSecret(generateSecret.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .authFlows(authFlows.orNull)
      .readAttributes(readAttributes.orNull)
      .build()
}
