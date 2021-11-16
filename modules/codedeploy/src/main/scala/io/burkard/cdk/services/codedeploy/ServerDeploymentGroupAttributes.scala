package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerDeploymentGroupAttributes {

  def apply(
    application: software.amazon.awscdk.services.codedeploy.IServerApplication,
    deploymentGroupName: String,
    deploymentConfig: Option[software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig] = None
  ): software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes =
    (new software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes.Builder)
      .application(application)
      .deploymentGroupName(deploymentGroupName)
      .deploymentConfig(deploymentConfig.orNull)
      .build()
}
