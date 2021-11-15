package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterConfigProperty {

  def apply(
    volumeSizeInGb: Option[Number] = None,
    volumeKmsKeyId: Option[String] = None,
    instanceType: Option[String] = None,
    instanceCount: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ClusterConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ClusterConfigProperty.Builder)
      .volumeSizeInGb(volumeSizeInGb.orNull)
      .volumeKmsKeyId(volumeKmsKeyId.orNull)
      .instanceType(instanceType.orNull)
      .instanceCount(instanceCount.orNull)
      .build()
}
