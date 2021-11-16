package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomLambdaDeploymentConfigProps {

  def apply(
    percentage: Number,
    interval: software.amazon.awscdk.Duration,
    `type`: software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType,
    deploymentConfigName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps =
    (new software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps.Builder)
      .percentage(percentage)
      .interval(interval)
      .`type`(`type`)
      .deploymentConfigName(deploymentConfigName.orNull)
      .build()
}
