package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthenticateCognitoActionProps {

  def apply(
    userPoolDomain: software.amazon.awscdk.services.cognito.IUserPoolDomain,
    userPoolClient: software.amazon.awscdk.services.cognito.IUserPoolClient,
    next: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction,
    userPool: software.amazon.awscdk.services.cognito.IUserPool,
    scope: Option[String] = None,
    sessionCookieName: Option[String] = None,
    sessionTimeout: Option[software.amazon.awscdk.Duration] = None,
    onUnauthenticatedRequest: Option[software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction] = None,
    authenticationRequestExtraParams: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps.Builder)
      .userPoolDomain(userPoolDomain)
      .userPoolClient(userPoolClient)
      .next(next)
      .userPool(userPool)
      .scope(scope.orNull)
      .sessionCookieName(sessionCookieName.orNull)
      .sessionTimeout(sessionTimeout.orNull)
      .onUnauthenticatedRequest(onUnauthenticatedRequest.orNull)
      .authenticationRequestExtraParams(authenticationRequestExtraParams.map(_.asJava).orNull)
      .build()
}
