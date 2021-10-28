package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReportGroupProps {

  def apply(
    reportGroupName: Option[String] = None,
    exportBucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    zipExport: Option[Boolean] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.codebuild.ReportGroupProps =
    (new software.amazon.awscdk.services.codebuild.ReportGroupProps.Builder)
      .reportGroupName(reportGroupName.orNull)
      .exportBucket(exportBucket.orNull)
      .zipExport(zipExport.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .removalPolicy(removalPolicy.orNull)
      .build()
}
