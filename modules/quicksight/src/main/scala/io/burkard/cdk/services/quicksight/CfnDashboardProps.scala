package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDashboardProps {

  def apply(
    awsAccountId: String,
    sourceEntity: software.amazon.awscdk.services.quicksight.CfnDashboard.DashboardSourceEntityProperty,
    dashboardId: String,
    name: Option[String] = None,
    dashboardPublishOptions: Option[software.amazon.awscdk.services.quicksight.CfnDashboard.DashboardPublishOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    permissions: Option[List[_]] = None,
    themeArn: Option[String] = None,
    versionDescription: Option[String] = None,
    parameters: Option[software.amazon.awscdk.services.quicksight.CfnDashboard.ParametersProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDashboardProps =
    (new software.amazon.awscdk.services.quicksight.CfnDashboardProps.Builder)
      .awsAccountId(awsAccountId)
      .sourceEntity(sourceEntity)
      .dashboardId(dashboardId)
      .name(name.orNull)
      .dashboardPublishOptions(dashboardPublishOptions.orNull)
      .tags(tags.map(_.asJava).orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .themeArn(themeArn.orNull)
      .versionDescription(versionDescription.orNull)
      .parameters(parameters.orNull)
      .build()
}
