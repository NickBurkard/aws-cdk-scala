package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimeBasedLinearProperty {

  def apply(
    linearPercentage: Number,
    linearInterval: Number
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty.Builder)
      .linearPercentage(linearPercentage)
      .linearInterval(linearInterval)
      .build()
}
