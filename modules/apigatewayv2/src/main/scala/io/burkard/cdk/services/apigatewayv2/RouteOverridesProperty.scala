package io.burkard.cdk.services.apigatewayv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RouteOverridesProperty {

  def apply(
    authorizationScopes: Option[List[String]] = None,
    authorizerId: Option[String] = None,
    authorizationType: Option[String] = None,
    target: Option[String] = None,
    operationName: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty.Builder)
      .authorizationScopes(authorizationScopes.map(_.asJava).orNull)
      .authorizerId(authorizerId.orNull)
      .authorizationType(authorizationType.orNull)
      .target(target.orNull)
      .operationName(operationName.orNull)
      .build()
}
