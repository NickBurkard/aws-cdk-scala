package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsDeploymentGroupAttributes {

  def apply(
    application: Option[software.amazon.awscdk.services.codedeploy.IEcsApplication] = None,
    deploymentConfig: Option[software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig] = None,
    deploymentGroupName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes =
    (new software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes.Builder)
      .application(application.orNull)
      .deploymentConfig(deploymentConfig.orNull)
      .deploymentGroupName(deploymentGroupName.orNull)
      .build()
}
