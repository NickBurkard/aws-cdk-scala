package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeployment {

  def apply(
    internalResourceId: String,
    deploymentCanarySettings: Option[software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty] = None,
    description: Option[String] = None,
    stageDescription: Option[software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty] = None,
    stageName: Option[String] = None,
    restApiId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnDeployment =
    software.amazon.awscdk.services.apigateway.CfnDeployment.Builder
      .create(stackCtx, internalResourceId)
      .deploymentCanarySettings(deploymentCanarySettings.orNull)
      .description(description.orNull)
      .stageDescription(stageDescription.orNull)
      .stageName(stageName.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
