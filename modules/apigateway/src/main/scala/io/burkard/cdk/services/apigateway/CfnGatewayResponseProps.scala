package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGatewayResponseProps {

  def apply(
    responseType: String,
    restApiId: String,
    statusCode: Option[String] = None,
    responseParameters: Option[Map[String, String]] = None,
    responseTemplates: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps =
    (new software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps.Builder)
      .responseType(responseType)
      .restApiId(restApiId)
      .statusCode(statusCode.orNull)
      .responseParameters(responseParameters.map(_.asJava).orNull)
      .responseTemplates(responseTemplates.map(_.asJava).orNull)
      .build()
}
