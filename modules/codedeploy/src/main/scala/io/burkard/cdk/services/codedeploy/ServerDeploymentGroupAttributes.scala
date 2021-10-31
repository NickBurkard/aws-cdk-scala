package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerDeploymentGroupAttributes {

  def apply(
    application: Option[software.amazon.awscdk.services.codedeploy.IServerApplication] = None,
    deploymentConfig: Option[software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig] = None,
    deploymentGroupName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes =
    (new software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes.Builder)
      .application(application.orNull)
      .deploymentConfig(deploymentConfig.orNull)
      .deploymentGroupName(deploymentGroupName.orNull)
      .build()
}
