package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConstraintsResourceProperty {

  def apply(
    s3Uri: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ConstraintsResourceProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ConstraintsResourceProperty.Builder)
      .s3Uri(s3Uri.orNull)
      .build()
}
