package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomLambdaDeploymentConfig {

  def apply(
    internalResourceId: String,
    percentage: Option[Number] = None,
    interval: Option[software.amazon.awscdk.Duration] = None,
    deploymentConfigName: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig =
    software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig.Builder
      .create(stackCtx, internalResourceId)
      .percentage(percentage.orNull)
      .interval(interval.orNull)
      .deploymentConfigName(deploymentConfigName.orNull)
      .`type`(`type`.orNull)
      .build()
}
