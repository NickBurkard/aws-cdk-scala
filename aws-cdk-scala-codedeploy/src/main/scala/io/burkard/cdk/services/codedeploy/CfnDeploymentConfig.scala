package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeploymentConfig {

  def apply(
    internalResourceId: String,
    computePlatform: Option[String] = None,
    minimumHealthyHosts: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty] = None,
    trafficRoutingConfig: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty] = None,
    deploymentConfigName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig =
    software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.Builder
      .create(stackCtx, internalResourceId)
      .computePlatform(computePlatform.orNull)
      .minimumHealthyHosts(minimumHealthyHosts.orNull)
      .trafficRoutingConfig(trafficRoutingConfig.orNull)
      .deploymentConfigName(deploymentConfigName.orNull)
      .build()
}
