package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationWithSubscribersProperty {

  def apply(
    subscribers: Option[List[_]] = None,
    notification: Option[software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty] = None
  ): software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder)
      .subscribers(subscribers.map(_.asJava).orNull)
      .notification(notification.orNull)
      .build()
}
