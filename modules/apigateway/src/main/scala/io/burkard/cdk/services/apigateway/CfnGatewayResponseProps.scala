package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGatewayResponseProps {

  def apply(
    statusCode: Option[String] = None,
    responseParameters: Option[Map[String, String]] = None,
    responseType: Option[String] = None,
    restApiId: Option[String] = None,
    responseTemplates: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps =
    (new software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps.Builder)
      .statusCode(statusCode.orNull)
      .responseParameters(responseParameters.map(_.asJava).orNull)
      .responseType(responseType.orNull)
      .restApiId(restApiId.orNull)
      .responseTemplates(responseTemplates.map(_.asJava).orNull)
      .build()
}
