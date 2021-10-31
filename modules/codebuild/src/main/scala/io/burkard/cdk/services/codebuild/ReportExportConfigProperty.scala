package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReportExportConfigProperty {

  def apply(
    exportConfigType: Option[String] = None,
    s3Destination: Option[software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty] = None
  ): software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty.Builder)
      .exportConfigType(exportConfigType.orNull)
      .s3Destination(s3Destination.orNull)
      .build()
}
