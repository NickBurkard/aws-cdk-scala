package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBudgetProps {

  def apply(
    budget: Option[software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty] = None,
    notificationsWithSubscribers: Option[List[_]] = None
  ): software.amazon.awscdk.services.budgets.CfnBudgetProps =
    (new software.amazon.awscdk.services.budgets.CfnBudgetProps.Builder)
      .budget(budget.orNull)
      .notificationsWithSubscribers(notificationsWithSubscribers.map(_.asJava).orNull)
      .build()
}
