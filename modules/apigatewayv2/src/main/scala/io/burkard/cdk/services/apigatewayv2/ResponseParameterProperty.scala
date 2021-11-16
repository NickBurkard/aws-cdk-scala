package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseParameterProperty {

  def apply(
    source: String,
    destination: String
  ): software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty.Builder)
      .source(source)
      .destination(destination)
      .build()
}
