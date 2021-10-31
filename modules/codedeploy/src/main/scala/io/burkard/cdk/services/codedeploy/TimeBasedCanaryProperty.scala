package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimeBasedCanaryProperty {

  def apply(
    canaryInterval: Option[Number] = None,
    canaryPercentage: Option[Number] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty.Builder)
      .canaryInterval(canaryInterval.orNull)
      .canaryPercentage(canaryPercentage.orNull)
      .build()
}
