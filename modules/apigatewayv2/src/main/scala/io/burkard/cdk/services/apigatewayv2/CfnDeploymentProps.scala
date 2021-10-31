package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeploymentProps {

  def apply(
    description: Option[String] = None,
    stageName: Option[String] = None,
    apiId: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps.Builder)
      .description(description.orNull)
      .stageName(stageName.orNull)
      .apiId(apiId.orNull)
      .build()
}
