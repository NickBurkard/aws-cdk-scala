package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
