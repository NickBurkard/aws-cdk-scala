package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuthenticateOidcConfigProperty {

  def apply(
    clientId: Option[String] = None,
    scope: Option[String] = None,
    sessionCookieName: Option[String] = None,
    authorizationEndpoint: Option[String] = None,
    clientSecret: Option[String] = None,
    userInfoEndpoint: Option[String] = None,
    tokenEndpoint: Option[String] = None,
    sessionTimeout: Option[String] = None,
    issuer: Option[String] = None,
    onUnauthenticatedRequest: Option[String] = None,
    authenticationRequestExtraParams: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty.Builder)
      .clientId(clientId.orNull)
      .scope(scope.orNull)
      .sessionCookieName(sessionCookieName.orNull)
      .authorizationEndpoint(authorizationEndpoint.orNull)
      .clientSecret(clientSecret.orNull)
      .userInfoEndpoint(userInfoEndpoint.orNull)
      .tokenEndpoint(tokenEndpoint.orNull)
      .sessionTimeout(sessionTimeout.orNull)
      .issuer(issuer.orNull)
      .onUnauthenticatedRequest(onUnauthenticatedRequest.orNull)
      .authenticationRequestExtraParams(authenticationRequestExtraParams.map(_.asJava).orNull)
      .build()
}
