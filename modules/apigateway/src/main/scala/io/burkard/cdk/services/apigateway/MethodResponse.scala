package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MethodResponse {

  def apply(
    statusCode: Option[String] = None,
    responseModels: Option[Map[String, _ <: software.amazon.awscdk.services.apigateway.IModel]] = None,
    responseParameters: Option[Map[String, _ <: Boolean]] = None
  ): software.amazon.awscdk.services.apigateway.MethodResponse =
    (new software.amazon.awscdk.services.apigateway.MethodResponse.Builder)
      .statusCode(statusCode.orNull)
      .responseModels(responseModels.map(_.asJava).orNull)
      .responseParameters(responseParameters.map(_.mapValues(Boolean.box).toMap.asJava).orNull)
      .build()
}
