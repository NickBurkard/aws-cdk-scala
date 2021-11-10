package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringOutputProperty {

  def apply(
    s3Output: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.S3OutputProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputProperty.Builder)
      .s3Output(s3Output.orNull)
      .build()
}
