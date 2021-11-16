package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReportGroup {

  def apply(
    internalResourceId: String,
    exportConfig: software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty,
    `type`: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    deleteReports: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.CfnReportGroup =
    software.amazon.awscdk.services.codebuild.CfnReportGroup.Builder
      .create(stackCtx, internalResourceId)
      .exportConfig(exportConfig)
      .`type`(`type`)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .deleteReports(deleteReports.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
