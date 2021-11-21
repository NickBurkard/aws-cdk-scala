package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterConstraintsProperty {

  def apply(
    required: Boolean
  ): software.amazon.awscdk.services.apigateway.CfnRouteResponseV2.ParameterConstraintsProperty =
    (new software.amazon.awscdk.services.apigateway.CfnRouteResponseV2.ParameterConstraintsProperty.Builder)
      .required(required)
      .build()
}
