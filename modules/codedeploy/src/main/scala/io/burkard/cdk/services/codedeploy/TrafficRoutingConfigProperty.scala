package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TrafficRoutingConfigProperty {

  def apply(
    timeBasedCanary: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty] = None,
    timeBasedLinear: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder)
      .timeBasedCanary(timeBasedCanary.orNull)
      .timeBasedLinear(timeBasedLinear.orNull)
      .`type`(`type`.orNull)
      .build()
}
