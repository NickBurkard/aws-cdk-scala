package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SharingSettingsProperty {

  def apply(
    s3OutputPath: Option[String] = None,
    s3KmsKeyId: Option[String] = None,
    notebookOutputOption: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty.Builder)
      .s3OutputPath(s3OutputPath.orNull)
      .s3KmsKeyId(s3KmsKeyId.orNull)
      .notebookOutputOption(notebookOutputOption.orNull)
      .build()
}
