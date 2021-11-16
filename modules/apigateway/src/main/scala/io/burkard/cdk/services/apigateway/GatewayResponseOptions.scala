package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayResponseOptions {

  def apply(
    `type`: software.amazon.awscdk.services.apigateway.ResponseType,
    statusCode: Option[String] = None,
    responseHeaders: Option[Map[String, String]] = None,
    templates: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.apigateway.GatewayResponseOptions =
    (new software.amazon.awscdk.services.apigateway.GatewayResponseOptions.Builder)
      .`type`(`type`)
      .statusCode(statusCode.orNull)
      .responseHeaders(responseHeaders.map(_.asJava).orNull)
      .templates(templates.map(_.asJava).orNull)
      .build()
}
