package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
