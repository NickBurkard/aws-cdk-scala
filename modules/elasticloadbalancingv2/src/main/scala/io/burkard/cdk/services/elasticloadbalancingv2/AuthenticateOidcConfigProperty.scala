package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthenticateOidcConfigProperty {

  def apply(
    clientId: String,
    authorizationEndpoint: String,
    clientSecret: String,
    userInfoEndpoint: String,
    tokenEndpoint: String,
    issuer: String,
    scope: Option[String] = None,
    sessionCookieName: Option[String] = None,
    sessionTimeout: Option[String] = None,
    onUnauthenticatedRequest: Option[String] = None,
    authenticationRequestExtraParams: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty.Builder)
      .clientId(clientId)
      .authorizationEndpoint(authorizationEndpoint)
      .clientSecret(clientSecret)
      .userInfoEndpoint(userInfoEndpoint)
      .tokenEndpoint(tokenEndpoint)
      .issuer(issuer)
      .scope(scope.orNull)
      .sessionCookieName(sessionCookieName.orNull)
      .sessionTimeout(sessionTimeout.orNull)
      .onUnauthenticatedRequest(onUnauthenticatedRequest.orNull)
      .authenticationRequestExtraParams(authenticationRequestExtraParams.map(_.asJava).orNull)
      .build()
}
