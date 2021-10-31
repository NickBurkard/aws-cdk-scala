package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayResponseProps {

  def apply(
    statusCode: Option[String] = None,
    restApi: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None,
    responseHeaders: Option[Map[String, String]] = None,
    templates: Option[Map[String, String]] = None,
    `type`: Option[software.amazon.awscdk.services.apigateway.ResponseType] = None
  ): software.amazon.awscdk.services.apigateway.GatewayResponseProps =
    (new software.amazon.awscdk.services.apigateway.GatewayResponseProps.Builder)
      .statusCode(statusCode.orNull)
      .restApi(restApi.orNull)
      .responseHeaders(responseHeaders.map(_.asJava).orNull)
      .templates(templates.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
