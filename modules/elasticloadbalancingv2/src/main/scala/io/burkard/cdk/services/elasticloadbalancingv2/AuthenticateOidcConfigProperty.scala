package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthenticateOidcConfigProperty {

  def apply(
    scope: Option[String] = None,
    sessionCookieName: Option[String] = None,
    authorizationEndpoint: Option[String] = None,
    clientSecret: Option[String] = None,
    userInfoEndpoint: Option[String] = None,
    tokenEndpoint: Option[String] = None,
    clientId: Option[String] = None,
    useExistingClientSecret: Option[Boolean] = None,
    sessionTimeout: Option[Number] = None,
    issuer: Option[String] = None,
    onUnauthenticatedRequest: Option[String] = None,
    authenticationRequestExtraParams: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty.Builder)
      .scope(scope.orNull)
      .sessionCookieName(sessionCookieName.orNull)
      .authorizationEndpoint(authorizationEndpoint.orNull)
      .clientSecret(clientSecret.orNull)
      .userInfoEndpoint(userInfoEndpoint.orNull)
      .tokenEndpoint(tokenEndpoint.orNull)
      .clientId(clientId.orNull)
      .useExistingClientSecret(useExistingClientSecret.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sessionTimeout(sessionTimeout.orNull)
      .issuer(issuer.orNull)
      .onUnauthenticatedRequest(onUnauthenticatedRequest.orNull)
      .authenticationRequestExtraParams(authenticationRequestExtraParams.map(_.asJava).orNull)
      .build()
}
