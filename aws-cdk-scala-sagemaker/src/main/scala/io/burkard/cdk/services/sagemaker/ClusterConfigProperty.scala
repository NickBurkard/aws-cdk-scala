package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClusterConfigProperty {

  def apply(
    volumeSizeInGb: Option[Number] = None,
    volumeKmsKeyId: Option[String] = None,
    instanceType: Option[String] = None,
    instanceCount: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty.Builder)
      .volumeSizeInGb(volumeSizeInGb.orNull)
      .volumeKmsKeyId(volumeKmsKeyId.orNull)
      .instanceType(instanceType.orNull)
      .instanceCount(instanceCount.orNull)
      .build()
}
