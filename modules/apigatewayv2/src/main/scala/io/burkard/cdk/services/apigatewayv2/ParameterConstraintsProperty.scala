package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterConstraintsProperty {

  def apply(
    required: Boolean
  ): software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty.Builder)
      .required(required)
      .build()
}
