package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReportGroupProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    exportConfig: Option[software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty] = None,
    deleteReports: Option[Boolean] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnReportGroupProps =
    (new software.amazon.awscdk.services.codebuild.CfnReportGroupProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .exportConfig(exportConfig.orNull)
      .deleteReports(deleteReports.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`type`(`type`.orNull)
      .build()
}
