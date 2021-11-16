package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeployment {

  def apply(
    internalResourceId: String,
    restApiId: String,
    deploymentCanarySettings: Option[software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty] = None,
    description: Option[String] = None,
    stageDescription: Option[software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty] = None,
    stageName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnDeployment =
    software.amazon.awscdk.services.apigateway.CfnDeployment.Builder
      .create(stackCtx, internalResourceId)
      .restApiId(restApiId)
      .deploymentCanarySettings(deploymentCanarySettings.orNull)
      .description(description.orNull)
      .stageDescription(stageDescription.orNull)
      .stageName(stageName.orNull)
      .build()
}
