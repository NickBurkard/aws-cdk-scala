package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationConfigProperty {

  def apply(
    notificationArn: String,
    notificationEvents: Option[List[String]] = None,
    notificationType: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty.Builder)
      .notificationArn(notificationArn)
      .notificationEvents(notificationEvents.map(_.asJava).orNull)
      .notificationType(notificationType.orNull)
      .build()
}
