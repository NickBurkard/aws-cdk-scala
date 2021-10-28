package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServerDeploymentConfigProps {

  def apply(
    minimumHealthyHosts: Option[software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts] = None,
    deploymentConfigName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps =
    (new software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps.Builder)
      .minimumHealthyHosts(minimumHealthyHosts.orNull)
      .deploymentConfigName(deploymentConfigName.orNull)
      .build()
}
