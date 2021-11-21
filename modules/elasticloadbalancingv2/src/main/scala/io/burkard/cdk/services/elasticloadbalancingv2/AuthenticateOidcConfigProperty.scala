package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthenticateOidcConfigProperty {

  def apply(
    authorizationEndpoint: String,
    clientSecret: String,
    userInfoEndpoint: String,
    tokenEndpoint: String,
    clientId: String,
    issuer: String,
    scope: Option[String] = None,
    sessionCookieName: Option[String] = None,
    useExistingClientSecret: Option[Boolean] = None,
    sessionTimeout: Option[Number] = None,
    onUnauthenticatedRequest: Option[String] = None,
    authenticationRequestExtraParams: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty.Builder)
      .authorizationEndpoint(authorizationEndpoint)
      .clientSecret(clientSecret)
      .userInfoEndpoint(userInfoEndpoint)
      .tokenEndpoint(tokenEndpoint)
      .clientId(clientId)
      .issuer(issuer)
      .scope(scope.orNull)
      .sessionCookieName(sessionCookieName.orNull)
      .useExistingClientSecret(useExistingClientSecret.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sessionTimeout(sessionTimeout.orNull)
      .onUnauthenticatedRequest(onUnauthenticatedRequest.orNull)
      .authenticationRequestExtraParams(authenticationRequestExtraParams.map(_.asJava).orNull)
      .build()
}
