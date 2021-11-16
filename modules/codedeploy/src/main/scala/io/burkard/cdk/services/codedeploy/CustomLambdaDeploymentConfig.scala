package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomLambdaDeploymentConfig {

  def apply(
    internalResourceId: String,
    percentage: Number,
    interval: software.amazon.awscdk.Duration,
    `type`: software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType,
    deploymentConfigName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig =
    software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig.Builder
      .create(stackCtx, internalResourceId)
      .percentage(percentage)
      .interval(interval)
      .`type`(`type`)
      .deploymentConfigName(deploymentConfigName.orNull)
      .build()
}
