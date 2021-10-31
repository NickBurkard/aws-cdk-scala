package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaDeploymentGroupAttributes {

  def apply(
    application: Option[software.amazon.awscdk.services.codedeploy.ILambdaApplication] = None,
    deploymentConfig: Option[software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig] = None,
    deploymentGroupName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes =
    (new software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes.Builder)
      .application(application.orNull)
      .deploymentConfig(deploymentConfig.orNull)
      .deploymentGroupName(deploymentGroupName.orNull)
      .build()
}
