package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeploymentConfigProps {

  def apply(
    computePlatform: Option[String] = None,
    minimumHealthyHosts: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty] = None,
    trafficRoutingConfig: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty] = None,
    deploymentConfigName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps.Builder)
      .computePlatform(computePlatform.orNull)
      .minimumHealthyHosts(minimumHealthyHosts.orNull)
      .trafficRoutingConfig(trafficRoutingConfig.orNull)
      .deploymentConfigName(deploymentConfigName.orNull)
      .build()
}
