package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MonitoringOutputProperty {

  def apply(
    s3Output: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty.Builder)
      .s3Output(s3Output.orNull)
      .build()
}
