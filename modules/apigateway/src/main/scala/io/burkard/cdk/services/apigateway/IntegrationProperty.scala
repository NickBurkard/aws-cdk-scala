package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IntegrationProperty {

  def apply(
    integrationHttpMethod: Option[String] = None,
    requestParameters: Option[Map[String, String]] = None,
    timeoutInMillis: Option[Number] = None,
    integrationResponses: Option[List[_]] = None,
    uri: Option[String] = None,
    cacheKeyParameters: Option[List[String]] = None,
    requestTemplates: Option[Map[String, String]] = None,
    cacheNamespace: Option[String] = None,
    contentHandling: Option[String] = None,
    connectionId: Option[String] = None,
    `type`: Option[String] = None,
    passthroughBehavior: Option[String] = None,
    credentials: Option[String] = None,
    connectionType: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty =
    (new software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty.Builder)
      .integrationHttpMethod(integrationHttpMethod.orNull)
      .requestParameters(requestParameters.map(_.asJava).orNull)
      .timeoutInMillis(timeoutInMillis.orNull)
      .integrationResponses(integrationResponses.map(_.asJava).orNull)
      .uri(uri.orNull)
      .cacheKeyParameters(cacheKeyParameters.map(_.asJava).orNull)
      .requestTemplates(requestTemplates.map(_.asJava).orNull)
      .cacheNamespace(cacheNamespace.orNull)
      .contentHandling(contentHandling.orNull)
      .connectionId(connectionId.orNull)
      .`type`(`type`.orNull)
      .passthroughBehavior(passthroughBehavior.orNull)
      .credentials(credentials.orNull)
      .connectionType(connectionType.orNull)
      .build()
}
