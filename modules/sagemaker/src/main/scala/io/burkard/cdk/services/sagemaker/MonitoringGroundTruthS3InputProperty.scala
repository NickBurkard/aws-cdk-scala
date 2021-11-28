package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringGroundTruthS3InputProperty {

  def apply(
    s3Uri: String
  ): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty.Builder)
      .s3Uri(s3Uri)
      .build()
}
