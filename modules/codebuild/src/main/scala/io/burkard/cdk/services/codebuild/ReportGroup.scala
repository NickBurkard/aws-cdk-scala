package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReportGroup {

  def apply(
    internalResourceId: String,
    reportGroupName: Option[String] = None,
    exportBucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    zipExport: Option[Boolean] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.ReportGroup =
    software.amazon.awscdk.services.codebuild.ReportGroup.Builder
      .create(stackCtx, internalResourceId)
      .reportGroupName(reportGroupName.orNull)
      .exportBucket(exportBucket.orNull)
      .zipExport(zipExport.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .removalPolicy(removalPolicy.orNull)
      .build()
}
