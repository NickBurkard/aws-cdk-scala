package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ReportExportConfigProperty {

  def apply(
    bucket: String,
    packaging: Option[String] = None,
    path: Option[String] = None,
    bucketOwner: Option[String] = None,
    encryptionDisabled: Option[Boolean] = None,
    encryptionKey: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty.Builder)
      .bucket(bucket)
      .packaging(packaging.orNull)
      .path(path.orNull)
      .bucketOwner(bucketOwner.orNull)
      .encryptionDisabled(encryptionDisabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encryptionKey(encryptionKey.orNull)
      .build()
}
