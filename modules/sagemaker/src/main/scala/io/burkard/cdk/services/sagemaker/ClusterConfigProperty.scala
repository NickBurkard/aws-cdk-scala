package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterConfigProperty {

  def apply(
    volumeSizeInGb: Number,
    instanceType: String,
    instanceCount: Number,
    volumeKmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty.Builder)
      .volumeSizeInGb(volumeSizeInGb)
      .instanceType(instanceType)
      .instanceCount(instanceCount)
      .volumeKmsKeyId(volumeKmsKeyId.orNull)
      .build()
}
