package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomLambdaDeploymentConfigProps {

  def apply(
    percentage: Option[Number] = None,
    interval: Option[software.amazon.awscdk.Duration] = None,
    deploymentConfigName: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType] = None
  ): software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps =
    (new software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps.Builder)
      .percentage(percentage.orNull)
      .interval(interval.orNull)
      .deploymentConfigName(deploymentConfigName.orNull)
      .`type`(`type`.orNull)
      .build()
}
