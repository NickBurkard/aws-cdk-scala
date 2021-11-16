package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaDeploymentGroupAttributes {

  def apply(
    application: software.amazon.awscdk.services.codedeploy.ILambdaApplication,
    deploymentGroupName: String,
    deploymentConfig: Option[software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig] = None
  ): software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes =
    (new software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes.Builder)
      .application(application)
      .deploymentGroupName(deploymentGroupName)
      .deploymentConfig(deploymentConfig.orNull)
      .build()
}
