package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeploymentProps {

  def apply(
    restApiId: String,
    deploymentCanarySettings: Option[software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty] = None,
    description: Option[String] = None,
    stageDescription: Option[software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty] = None,
    stageName: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnDeploymentProps =
    (new software.amazon.awscdk.services.apigateway.CfnDeploymentProps.Builder)
      .restApiId(restApiId)
      .deploymentCanarySettings(deploymentCanarySettings.orNull)
      .description(description.orNull)
      .stageDescription(stageDescription.orNull)
      .stageName(stageName.orNull)
      .build()
}
