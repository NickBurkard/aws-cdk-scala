package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MethodResponseProperty {

  def apply(
    statusCode: Option[String] = None,
    responseModels: Option[Map[String, String]] = None,
    responseParameters: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty =
    (new software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty.Builder)
      .statusCode(statusCode.orNull)
      .responseModels(responseModels.map(_.asJava).orNull)
      .responseParameters(responseParameters.map(_.asJava).orNull)
      .build()
}
