package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IntegrationResponseProperty {

  def apply(
    statusCode: Option[String] = None,
    selectionPattern: Option[String] = None,
    responseParameters: Option[Map[String, String]] = None,
    contentHandling: Option[String] = None,
    responseTemplates: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty =
    (new software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty.Builder)
      .statusCode(statusCode.orNull)
      .selectionPattern(selectionPattern.orNull)
      .responseParameters(responseParameters.map(_.asJava).orNull)
      .contentHandling(contentHandling.orNull)
      .responseTemplates(responseTemplates.map(_.asJava).orNull)
      .build()
}
