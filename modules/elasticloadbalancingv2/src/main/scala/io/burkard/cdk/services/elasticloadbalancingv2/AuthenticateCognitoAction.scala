package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuthenticateCognitoAction {

  def apply(
    userPoolDomain: Option[software.amazon.awscdk.services.cognito.IUserPoolDomain] = None,
    scope: Option[String] = None,
    sessionCookieName: Option[String] = None,
    sessionTimeout: Option[software.amazon.awscdk.Duration] = None,
    userPoolClient: Option[software.amazon.awscdk.services.cognito.IUserPoolClient] = None,
    next: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None,
    onUnauthenticatedRequest: Option[software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction] = None,
    authenticationRequestExtraParams: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction =
    software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction.Builder
      .create()
      .userPoolDomain(userPoolDomain.orNull)
      .scope(scope.orNull)
      .sessionCookieName(sessionCookieName.orNull)
      .sessionTimeout(sessionTimeout.orNull)
      .userPoolClient(userPoolClient.orNull)
      .next(next.orNull)
      .userPool(userPool.orNull)
      .onUnauthenticatedRequest(onUnauthenticatedRequest.orNull)
      .authenticationRequestExtraParams(authenticationRequestExtraParams.map(_.asJava).orNull)
      .build()
}
