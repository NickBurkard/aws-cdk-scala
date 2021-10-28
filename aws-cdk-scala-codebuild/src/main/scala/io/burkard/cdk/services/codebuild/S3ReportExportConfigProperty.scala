package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3ReportExportConfigProperty {

  def apply(
    packaging: Option[String] = None,
    path: Option[String] = None,
    bucketOwner: Option[String] = None,
    bucket: Option[String] = None,
    encryptionDisabled: Option[Boolean] = None,
    encryptionKey: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty.Builder)
      .packaging(packaging.orNull)
      .path(path.orNull)
      .bucketOwner(bucketOwner.orNull)
      .bucket(bucket.orNull)
      .encryptionDisabled(encryptionDisabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encryptionKey(encryptionKey.orNull)
      .build()
}
