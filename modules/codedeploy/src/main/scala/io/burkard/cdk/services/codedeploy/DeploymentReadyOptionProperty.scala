package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeploymentReadyOptionProperty {

  def apply(
    actionOnTimeout: Option[String] = None,
    waitTimeInMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty.Builder)
      .actionOnTimeout(actionOnTimeout.orNull)
      .waitTimeInMinutes(waitTimeInMinutes.orNull)
      .build()
}
