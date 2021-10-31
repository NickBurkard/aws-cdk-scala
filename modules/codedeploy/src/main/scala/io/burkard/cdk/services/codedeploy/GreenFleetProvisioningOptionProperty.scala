package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GreenFleetProvisioningOptionProperty {

  def apply(
    action: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty.Builder)
      .action(action.orNull)
      .build()
}
