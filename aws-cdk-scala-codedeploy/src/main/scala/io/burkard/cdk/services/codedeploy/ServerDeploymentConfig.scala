package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServerDeploymentConfig {

  def apply(
    internalResourceId: String,
    minimumHealthyHosts: Option[software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts] = None,
    deploymentConfigName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig =
    software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig.Builder
      .create(stackCtx, internalResourceId)
      .minimumHealthyHosts(minimumHealthyHosts.orNull)
      .deploymentConfigName(deploymentConfigName.orNull)
      .build()
}
