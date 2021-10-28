package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaDeploymentConfigImportProps {

  def apply(
    deploymentConfigName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps =
    (new software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps.Builder)
      .deploymentConfigName(deploymentConfigName.orNull)
      .build()
}
