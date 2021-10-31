package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayResponse {

  def apply(
    internalResourceId: String,
    statusCode: Option[String] = None,
    restApi: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None,
    responseHeaders: Option[Map[String, String]] = None,
    templates: Option[Map[String, String]] = None,
    `type`: Option[software.amazon.awscdk.services.apigateway.ResponseType] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.GatewayResponse =
    software.amazon.awscdk.services.apigateway.GatewayResponse.Builder
      .create(stackCtx, internalResourceId)
      .statusCode(statusCode.orNull)
      .restApi(restApi.orNull)
      .responseHeaders(responseHeaders.map(_.asJava).orNull)
      .templates(templates.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
