package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BlueGreenDeploymentConfigurationProperty {

  def apply(
    terminateBlueInstancesOnDeploymentSuccess: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty] = None,
    deploymentReadyOption: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty] = None,
    greenFleetProvisioningOption: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.Builder)
      .terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess.orNull)
      .deploymentReadyOption(deploymentReadyOption.orNull)
      .greenFleetProvisioningOption(greenFleetProvisioningOption.orNull)
      .build()
}
