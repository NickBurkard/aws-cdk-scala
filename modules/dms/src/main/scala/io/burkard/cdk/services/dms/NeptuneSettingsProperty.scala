package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NeptuneSettingsProperty {

  def apply(
    serviceAccessRoleArn: Option[String] = None,
    iamAuthEnabled: Option[Boolean] = None,
    s3BucketName: Option[String] = None,
    s3BucketFolder: Option[String] = None,
    maxRetryCount: Option[Number] = None,
    maxFileSize: Option[Number] = None,
    errorRetryDuration: Option[Number] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty.Builder)
      .serviceAccessRoleArn(serviceAccessRoleArn.orNull)
      .iamAuthEnabled(iamAuthEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3BucketName(s3BucketName.orNull)
      .s3BucketFolder(s3BucketFolder.orNull)
      .maxRetryCount(maxRetryCount.orNull)
      .maxFileSize(maxFileSize.orNull)
      .errorRetryDuration(errorRetryDuration.orNull)
      .build()
}
