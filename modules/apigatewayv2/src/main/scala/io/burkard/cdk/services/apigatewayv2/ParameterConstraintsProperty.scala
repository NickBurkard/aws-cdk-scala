package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterConstraintsProperty {

  def apply(
    required: Boolean
  ): software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty.Builder)
      .required(required)
      .build()
}
