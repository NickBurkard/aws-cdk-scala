package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerDeploymentConfig {

  def apply(
    internalResourceId: String,
    minimumHealthyHosts: software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts,
    deploymentConfigName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig =
    software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig.Builder
      .create(stackCtx, internalResourceId)
      .minimumHealthyHosts(minimumHealthyHosts)
      .deploymentConfigName(deploymentConfigName.orNull)
      .build()
}
