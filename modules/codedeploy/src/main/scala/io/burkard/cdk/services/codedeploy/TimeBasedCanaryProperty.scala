package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimeBasedCanaryProperty {

  def apply(
    canaryInterval: Number,
    canaryPercentage: Number
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty.Builder)
      .canaryInterval(canaryInterval)
      .canaryPercentage(canaryPercentage)
      .build()
}
