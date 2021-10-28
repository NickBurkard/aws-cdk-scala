package io.burkard.cdk.services.apigatewayv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResponseParameterListProperty {

  def apply(
    responseParameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty.Builder)
      .responseParameters(responseParameters.map(_.asJava).orNull)
      .build()
}
