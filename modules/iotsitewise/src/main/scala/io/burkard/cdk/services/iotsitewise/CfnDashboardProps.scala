package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDashboardProps {

  def apply(
    dashboardDescription: String,
    dashboardName: String,
    dashboardDefinition: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    projectId: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnDashboardProps =
    (new software.amazon.awscdk.services.iotsitewise.CfnDashboardProps.Builder)
      .dashboardDescription(dashboardDescription)
      .dashboardName(dashboardName)
      .dashboardDefinition(dashboardDefinition)
      .tags(tags.map(_.asJava).orNull)
      .projectId(projectId.orNull)
      .build()
}
