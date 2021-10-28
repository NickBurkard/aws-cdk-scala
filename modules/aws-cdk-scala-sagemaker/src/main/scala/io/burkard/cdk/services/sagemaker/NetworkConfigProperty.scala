package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkConfigProperty {

  def apply(
    enableInterContainerTrafficEncryption: Option[Boolean] = None,
    enableNetworkIsolation: Option[Boolean] = None,
    vpcConfig: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty.Builder)
      .enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableNetworkIsolation(enableNetworkIsolation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcConfig(vpcConfig.orNull)
      .build()
}
