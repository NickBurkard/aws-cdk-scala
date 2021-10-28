package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParameterConstraintsProperty {

  def apply(
    required: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty.Builder)
      .required(required.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
