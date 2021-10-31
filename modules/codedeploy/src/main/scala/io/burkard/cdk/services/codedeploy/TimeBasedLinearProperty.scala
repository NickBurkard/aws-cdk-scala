package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimeBasedLinearProperty {

  def apply(
    linearPercentage: Option[Number] = None,
    linearInterval: Option[Number] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty.Builder)
      .linearPercentage(linearPercentage.orNull)
      .linearInterval(linearInterval.orNull)
      .build()
}
