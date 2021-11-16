package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsDeploymentGroupAttributes {

  def apply(
    application: software.amazon.awscdk.services.codedeploy.IEcsApplication,
    deploymentGroupName: String,
    deploymentConfig: Option[software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig] = None
  ): software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes =
    (new software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes.Builder)
      .application(application)
      .deploymentGroupName(deploymentGroupName)
      .deploymentConfig(deploymentConfig.orNull)
      .build()
}
