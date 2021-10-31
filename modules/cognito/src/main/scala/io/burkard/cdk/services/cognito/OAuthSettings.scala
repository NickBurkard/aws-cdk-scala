package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OAuthSettings {

  def apply(
    scopes: Option[List[_ <: software.amazon.awscdk.services.cognito.OAuthScope]] = None,
    flows: Option[software.amazon.awscdk.services.cognito.OAuthFlows] = None,
    callbackUrls: Option[List[String]] = None,
    logoutUrls: Option[List[String]] = None
  ): software.amazon.awscdk.services.cognito.OAuthSettings =
    (new software.amazon.awscdk.services.cognito.OAuthSettings.Builder)
      .scopes(scopes.map(_.asJava).orNull)
      .flows(flows.orNull)
      .callbackUrls(callbackUrls.map(_.asJava).orNull)
      .logoutUrls(logoutUrls.map(_.asJava).orNull)
      .build()
}
