package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReportGroupProps {

  def apply(
    exportConfig: software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty,
    `type`: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    deleteReports: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.CfnReportGroupProps =
    (new software.amazon.awscdk.services.codebuild.CfnReportGroupProps.Builder)
      .exportConfig(exportConfig)
      .`type`(`type`)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .deleteReports(deleteReports.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
