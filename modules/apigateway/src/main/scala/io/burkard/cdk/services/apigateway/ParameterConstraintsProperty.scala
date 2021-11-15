package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterConstraintsProperty {

  def apply(
    required: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.CfnRouteV2.ParameterConstraintsProperty =
    (new software.amazon.awscdk.services.apigateway.CfnRouteV2.ParameterConstraintsProperty.Builder)
      .required(required.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
