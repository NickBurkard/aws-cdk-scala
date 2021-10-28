package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDashboard {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    awsAccountId: Option[String] = None,
    dashboardPublishOptions: Option[software.amazon.awscdk.services.quicksight.CfnDashboard.DashboardPublishOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    permissions: Option[List[_]] = None,
    themeArn: Option[String] = None,
    versionDescription: Option[String] = None,
    parameters: Option[software.amazon.awscdk.services.quicksight.CfnDashboard.ParametersProperty] = None,
    sourceEntity: Option[software.amazon.awscdk.services.quicksight.CfnDashboard.DashboardSourceEntityProperty] = None,
    dashboardId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.quicksight.CfnDashboard =
    software.amazon.awscdk.services.quicksight.CfnDashboard.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .awsAccountId(awsAccountId.orNull)
      .dashboardPublishOptions(dashboardPublishOptions.orNull)
      .tags(tags.map(_.asJava).orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .themeArn(themeArn.orNull)
      .versionDescription(versionDescription.orNull)
      .parameters(parameters.orNull)
      .sourceEntity(sourceEntity.orNull)
      .dashboardId(dashboardId.orNull)
      .build()
}
