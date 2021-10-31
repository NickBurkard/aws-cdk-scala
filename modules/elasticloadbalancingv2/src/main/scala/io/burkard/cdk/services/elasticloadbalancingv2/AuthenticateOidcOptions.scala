package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuthenticateOidcOptions {

  def apply(
    clientId: Option[String] = None,
    scope: Option[String] = None,
    sessionCookieName: Option[String] = None,
    authorizationEndpoint: Option[String] = None,
    userInfoEndpoint: Option[String] = None,
    tokenEndpoint: Option[String] = None,
    sessionTimeout: Option[software.amazon.awscdk.Duration] = None,
    issuer: Option[String] = None,
    onUnauthenticatedRequest: Option[software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction] = None,
    authenticationRequestExtraParams: Option[Map[String, String]] = None,
    next: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction] = None,
    clientSecret: Option[software.amazon.awscdk.SecretValue] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions.Builder)
      .clientId(clientId.orNull)
      .scope(scope.orNull)
      .sessionCookieName(sessionCookieName.orNull)
      .authorizationEndpoint(authorizationEndpoint.orNull)
      .userInfoEndpoint(userInfoEndpoint.orNull)
      .tokenEndpoint(tokenEndpoint.orNull)
      .sessionTimeout(sessionTimeout.orNull)
      .issuer(issuer.orNull)
      .onUnauthenticatedRequest(onUnauthenticatedRequest.orNull)
      .authenticationRequestExtraParams(authenticationRequestExtraParams.map(_.asJava).orNull)
      .next(next.orNull)
      .clientSecret(clientSecret.orNull)
      .build()
}
