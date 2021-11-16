package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeploymentConfigProperty {

  def apply(
    blueGreenUpdatePolicy: software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty,
    autoRollbackConfiguration: Option[software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty.Builder)
      .blueGreenUpdatePolicy(blueGreenUpdatePolicy)
      .autoRollbackConfiguration(autoRollbackConfiguration.orNull)
      .build()
}
