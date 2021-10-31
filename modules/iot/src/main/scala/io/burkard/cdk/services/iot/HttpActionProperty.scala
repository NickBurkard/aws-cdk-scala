package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpActionProperty {

  def apply(
    confirmationUrl: Option[String] = None,
    headers: Option[List[_]] = None,
    auth: Option[software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty] = None,
    url: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty.Builder)
      .confirmationUrl(confirmationUrl.orNull)
      .headers(headers.map(_.asJava).orNull)
      .auth(auth.orNull)
      .url(url.orNull)
      .build()
}
