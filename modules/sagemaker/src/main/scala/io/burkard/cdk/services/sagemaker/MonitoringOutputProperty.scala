package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringOutputProperty {

  def apply(
    s3Output: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty
  ): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty.Builder)
      .s3Output(s3Output)
      .build()
}
