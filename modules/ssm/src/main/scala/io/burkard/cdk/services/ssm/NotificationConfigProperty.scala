package io.burkard.cdk.services.ssm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationConfigProperty {

  def apply(
    notificationEvents: Option[List[String]] = None,
    notificationArn: Option[String] = None,
    notificationType: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty.Builder)
      .notificationEvents(notificationEvents.map(_.asJava).orNull)
      .notificationArn(notificationArn.orNull)
      .notificationType(notificationType.orNull)
      .build()
}
