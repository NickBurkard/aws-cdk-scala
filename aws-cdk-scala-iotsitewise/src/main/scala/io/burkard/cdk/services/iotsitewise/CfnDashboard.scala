package io.burkard.cdk.services.iotsitewise

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDashboard {

  def apply(
    internalResourceId: String,
    dashboardDescription: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    projectId: Option[String] = None,
    dashboardName: Option[String] = None,
    dashboardDefinition: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotsitewise.CfnDashboard =
    software.amazon.awscdk.services.iotsitewise.CfnDashboard.Builder
      .create(stackCtx, internalResourceId)
      .dashboardDescription(dashboardDescription.orNull)
      .tags(tags.map(_.asJava).orNull)
      .projectId(projectId.orNull)
      .dashboardName(dashboardName.orNull)
      .dashboardDefinition(dashboardDefinition.orNull)
      .build()
}
