package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3OutputProperty {

  def apply(
    s3UploadMode: Option[String] = None,
    s3Uri: Option[String] = None,
    localPath: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty.Builder)
      .s3UploadMode(s3UploadMode.orNull)
      .s3Uri(s3Uri.orNull)
      .localPath(localPath.orNull)
      .build()
}
