package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StatisticsResourceProperty {

  def apply(
    s3Uri: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StatisticsResourceProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StatisticsResourceProperty.Builder)
      .s3Uri(s3Uri.orNull)
      .build()
}
