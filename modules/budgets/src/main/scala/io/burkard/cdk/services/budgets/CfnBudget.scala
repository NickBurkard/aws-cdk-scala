package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBudget {

  def apply(
    internalResourceId: String,
    budget: Option[software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty] = None,
    notificationsWithSubscribers: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.budgets.CfnBudget =
    software.amazon.awscdk.services.budgets.CfnBudget.Builder
      .create(stackCtx, internalResourceId)
      .budget(budget.orNull)
      .notificationsWithSubscribers(notificationsWithSubscribers.map(_.asJava).orNull)
      .build()
}
