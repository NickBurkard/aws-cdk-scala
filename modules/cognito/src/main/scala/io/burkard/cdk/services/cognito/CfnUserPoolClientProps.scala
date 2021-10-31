package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolClientProps {

  def apply(
    accessTokenValidity: Option[Number] = None,
    writeAttributes: Option[List[String]] = None,
    enableTokenRevocation: Option[Boolean] = None,
    defaultRedirectUri: Option[String] = None,
    allowedOAuthScopes: Option[List[String]] = None,
    logoutUrLs: Option[List[String]] = None,
    allowedOAuthFlows: Option[List[String]] = None,
    refreshTokenValidity: Option[Number] = None,
    tokenValidityUnits: Option[software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty] = None,
    readAttributes: Option[List[String]] = None,
    preventUserExistenceErrors: Option[String] = None,
    analyticsConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty] = None,
    allowedOAuthFlowsUserPoolClient: Option[Boolean] = None,
    callbackUrLs: Option[List[String]] = None,
    clientName: Option[String] = None,
    userPoolId: Option[String] = None,
    idTokenValidity: Option[Number] = None,
    generateSecret: Option[Boolean] = None,
    explicitAuthFlows: Option[List[String]] = None,
    supportedIdentityProviders: Option[List[String]] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolClientProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder)
      .accessTokenValidity(accessTokenValidity.orNull)
      .writeAttributes(writeAttributes.map(_.asJava).orNull)
      .enableTokenRevocation(enableTokenRevocation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultRedirectUri(defaultRedirectUri.orNull)
      .allowedOAuthScopes(allowedOAuthScopes.map(_.asJava).orNull)
      .logoutUrLs(logoutUrLs.map(_.asJava).orNull)
      .allowedOAuthFlows(allowedOAuthFlows.map(_.asJava).orNull)
      .refreshTokenValidity(refreshTokenValidity.orNull)
      .tokenValidityUnits(tokenValidityUnits.orNull)
      .readAttributes(readAttributes.map(_.asJava).orNull)
      .preventUserExistenceErrors(preventUserExistenceErrors.orNull)
      .analyticsConfiguration(analyticsConfiguration.orNull)
      .allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .callbackUrLs(callbackUrLs.map(_.asJava).orNull)
      .clientName(clientName.orNull)
      .userPoolId(userPoolId.orNull)
      .idTokenValidity(idTokenValidity.orNull)
      .generateSecret(generateSecret.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .explicitAuthFlows(explicitAuthFlows.map(_.asJava).orNull)
      .supportedIdentityProviders(supportedIdentityProviders.map(_.asJava).orNull)
      .build()
}
