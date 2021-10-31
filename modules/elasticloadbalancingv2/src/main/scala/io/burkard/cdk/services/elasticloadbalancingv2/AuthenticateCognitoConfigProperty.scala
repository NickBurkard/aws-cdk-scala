package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuthenticateCognitoConfigProperty {

  def apply(
    userPoolArn: Option[String] = None,
    userPoolDomain: Option[String] = None,
    scope: Option[String] = None,
    sessionCookieName: Option[String] = None,
    sessionTimeout: Option[String] = None,
    onUnauthenticatedRequest: Option[String] = None,
    authenticationRequestExtraParams: Option[Map[String, String]] = None,
    userPoolClientId: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty.Builder)
      .userPoolArn(userPoolArn.orNull)
      .userPoolDomain(userPoolDomain.orNull)
      .scope(scope.orNull)
      .sessionCookieName(sessionCookieName.orNull)
      .sessionTimeout(sessionTimeout.orNull)
      .onUnauthenticatedRequest(onUnauthenticatedRequest.orNull)
      .authenticationRequestExtraParams(authenticationRequestExtraParams.map(_.asJava).orNull)
      .userPoolClientId(userPoolClientId.orNull)
      .build()
}
