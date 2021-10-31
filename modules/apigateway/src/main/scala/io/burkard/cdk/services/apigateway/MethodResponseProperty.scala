package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
