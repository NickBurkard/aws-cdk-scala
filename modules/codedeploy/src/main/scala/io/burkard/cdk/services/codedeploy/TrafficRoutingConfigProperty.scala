package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TrafficRoutingConfigProperty {

  def apply(
    `type`: String,
    timeBasedCanary: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty] = None,
    timeBasedLinear: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder)
      .`type`(`type`)
      .timeBasedCanary(timeBasedCanary.orNull)
      .timeBasedLinear(timeBasedLinear.orNull)
      .build()
}
