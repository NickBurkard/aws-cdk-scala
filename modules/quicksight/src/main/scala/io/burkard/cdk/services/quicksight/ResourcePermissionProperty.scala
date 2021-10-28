package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourcePermissionProperty {

  def apply(
    principal: Option[String] = None,
    actions: Option[List[String]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.ResourcePermissionProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.ResourcePermissionProperty.Builder)
      .principal(principal.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
