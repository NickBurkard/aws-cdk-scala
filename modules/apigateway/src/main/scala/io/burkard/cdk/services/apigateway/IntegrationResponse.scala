package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IntegrationResponse {

  def apply(
    statusCode: String,
    selectionPattern: Option[String] = None,
    responseParameters: Option[Map[String, String]] = None,
    contentHandling: Option[software.amazon.awscdk.services.apigateway.ContentHandling] = None,
    responseTemplates: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.apigateway.IntegrationResponse =
    (new software.amazon.awscdk.services.apigateway.IntegrationResponse.Builder)
      .statusCode(statusCode)
      .selectionPattern(selectionPattern.orNull)
      .responseParameters(responseParameters.map(_.asJava).orNull)
      .contentHandling(contentHandling.orNull)
      .responseTemplates(responseTemplates.map(_.asJava).orNull)
      .build()
}
