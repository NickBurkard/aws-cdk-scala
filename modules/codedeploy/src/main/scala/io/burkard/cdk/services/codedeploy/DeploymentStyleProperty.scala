package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeploymentStyleProperty {

  def apply(
    deploymentType: Option[String] = None,
    deploymentOption: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty.Builder)
      .deploymentType(deploymentType.orNull)
      .deploymentOption(deploymentOption.orNull)
      .build()
}
