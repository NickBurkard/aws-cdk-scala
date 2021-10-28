package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGatewayResponse {

  def apply(
    internalResourceId: String,
    statusCode: Option[String] = None,
    responseParameters: Option[Map[String, String]] = None,
    responseType: Option[String] = None,
    restApiId: Option[String] = None,
    responseTemplates: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnGatewayResponse =
    software.amazon.awscdk.services.apigateway.CfnGatewayResponse.Builder
      .create(stackCtx, internalResourceId)
      .statusCode(statusCode.orNull)
      .responseParameters(responseParameters.map(_.asJava).orNull)
      .responseType(responseType.orNull)
      .restApiId(restApiId.orNull)
      .responseTemplates(responseTemplates.map(_.asJava).orNull)
      .build()
}
