package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeploymentV2 {

  def apply(
    internalResourceId: String,
    apiId: String,
    description: Option[String] = None,
    stageName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnDeploymentV2 =
    software.amazon.awscdk.services.apigateway.CfnDeploymentV2.Builder
      .create(stackCtx, internalResourceId)
      .apiId(apiId)
      .description(description.orNull)
      .stageName(stageName.orNull)
      .build()
}
