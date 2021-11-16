package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerDeploymentConfigProps {

  def apply(
    minimumHealthyHosts: software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts,
    deploymentConfigName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps =
    (new software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps.Builder)
      .minimumHealthyHosts(minimumHealthyHosts)
      .deploymentConfigName(deploymentConfigName.orNull)
      .build()
}
