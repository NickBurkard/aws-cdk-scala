package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3OutputProperty {

  def apply(
    s3Uri: String,
    localPath: String,
    s3UploadMode: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty.Builder)
      .s3Uri(s3Uri)
      .localPath(localPath)
      .s3UploadMode(s3UploadMode.orNull)
      .build()
}
