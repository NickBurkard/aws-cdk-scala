package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkConfigProperty {

  def apply(
    enableInterContainerTrafficEncryption: Option[Boolean] = None,
    enableNetworkIsolation: Option[Boolean] = None,
    vpcConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty.Builder)
      .enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableNetworkIsolation(enableNetworkIsolation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcConfig(vpcConfig.orNull)
      .build()
}
