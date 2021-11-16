package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeployment {

  def apply(
    internalResourceId: String,
    apiId: String,
    description: Option[String] = None,
    stageName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnDeployment =
    software.amazon.awscdk.services.apigatewayv2.CfnDeployment.Builder
      .create(stackCtx, internalResourceId)
      .apiId(apiId)
      .description(description.orNull)
      .stageName(stageName.orNull)
      .build()
}
