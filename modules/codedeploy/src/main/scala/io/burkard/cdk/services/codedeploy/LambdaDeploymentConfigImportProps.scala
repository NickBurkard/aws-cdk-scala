package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaDeploymentConfigImportProps {

  def apply(
    deploymentConfigName: String
  ): software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps =
    (new software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps.Builder)
      .deploymentConfigName(deploymentConfigName)
      .build()
}
