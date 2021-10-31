package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
