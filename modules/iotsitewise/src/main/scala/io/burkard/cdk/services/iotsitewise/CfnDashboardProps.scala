package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDashboardProps {

  def apply(
    dashboardDescription: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    projectId: Option[String] = None,
    dashboardName: Option[String] = None,
    dashboardDefinition: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnDashboardProps =
    (new software.amazon.awscdk.services.iotsitewise.CfnDashboardProps.Builder)
      .dashboardDescription(dashboardDescription.orNull)
      .tags(tags.map(_.asJava).orNull)
      .projectId(projectId.orNull)
      .dashboardName(dashboardName.orNull)
      .dashboardDefinition(dashboardDefinition.orNull)
      .build()
}
