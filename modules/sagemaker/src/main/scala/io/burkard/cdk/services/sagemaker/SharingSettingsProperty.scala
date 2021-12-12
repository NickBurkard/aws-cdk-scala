package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SharingSettingsProperty {

  def apply(
    s3OutputPath: Option[String] = None,
    s3KmsKeyId: Option[String] = None,
    notebookOutputOption: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty.Builder)
      .s3OutputPath(s3OutputPath.orNull)
      .s3KmsKeyId(s3KmsKeyId.orNull)
      .notebookOutputOption(notebookOutputOption.orNull)
      .build()
}
