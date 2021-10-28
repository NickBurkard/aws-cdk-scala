package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
