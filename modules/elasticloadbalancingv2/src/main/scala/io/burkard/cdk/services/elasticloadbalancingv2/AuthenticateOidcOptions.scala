package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthenticateOidcOptions {

  def apply(
    clientId: String,
    authorizationEndpoint: String,
    userInfoEndpoint: String,
    tokenEndpoint: String,
    issuer: String,
    next: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction,
    clientSecret: software.amazon.awscdk.SecretValue,
    scope: Option[String] = None,
    sessionCookieName: Option[String] = None,
    sessionTimeout: Option[software.amazon.awscdk.Duration] = None,
    onUnauthenticatedRequest: Option[software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction] = None,
    authenticationRequestExtraParams: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions.Builder)
      .clientId(clientId)
      .authorizationEndpoint(authorizationEndpoint)
      .userInfoEndpoint(userInfoEndpoint)
      .tokenEndpoint(tokenEndpoint)
      .issuer(issuer)
      .next(next)
      .clientSecret(clientSecret)
      .scope(scope.orNull)
      .sessionCookieName(sessionCookieName.orNull)
      .sessionTimeout(sessionTimeout.orNull)
      .onUnauthenticatedRequest(onUnauthenticatedRequest.orNull)
      .authenticationRequestExtraParams(authenticationRequestExtraParams.map(_.asJava).orNull)
      .build()
}
