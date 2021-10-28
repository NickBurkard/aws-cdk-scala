package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeployment {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    stageName: Option[String] = None,
    apiId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnDeployment =
    software.amazon.awscdk.services.apigatewayv2.CfnDeployment.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .stageName(stageName.orNull)
      .apiId(apiId.orNull)
      .build()
}
