package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationWithSubscribersProperty {

  def apply(
    subscribers: List[_],
    notification: software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty
  ): software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder)
      .subscribers(subscribers.asJava)
      .notification(notification)
      .build()
}
