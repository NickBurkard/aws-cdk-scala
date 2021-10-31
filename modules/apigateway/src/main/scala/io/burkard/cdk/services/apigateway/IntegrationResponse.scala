package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IntegrationResponse {

  def apply(
    statusCode: Option[String] = None,
    selectionPattern: Option[String] = None,
    responseParameters: Option[Map[String, String]] = None,
    contentHandling: Option[software.amazon.awscdk.services.apigateway.ContentHandling] = None,
    responseTemplates: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.apigateway.IntegrationResponse =
    (new software.amazon.awscdk.services.apigateway.IntegrationResponse.Builder)
      .statusCode(statusCode.orNull)
      .selectionPattern(selectionPattern.orNull)
      .responseParameters(responseParameters.map(_.asJava).orNull)
      .contentHandling(contentHandling.orNull)
      .responseTemplates(responseTemplates.map(_.asJava).orNull)
      .build()
}
