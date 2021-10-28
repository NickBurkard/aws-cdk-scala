package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeploymentConfigProperty {

  def apply(
    autoRollbackConfiguration: Option[software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty] = None,
    blueGreenUpdatePolicy: Option[software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty.Builder)
      .autoRollbackConfiguration(autoRollbackConfiguration.orNull)
      .blueGreenUpdatePolicy(blueGreenUpdatePolicy.orNull)
      .build()
}
