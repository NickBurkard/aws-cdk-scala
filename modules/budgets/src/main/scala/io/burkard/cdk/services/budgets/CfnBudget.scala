package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBudget {

  def apply(
    internalResourceId: String,
    budget: software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty,
    notificationsWithSubscribers: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.budgets.CfnBudget =
    software.amazon.awscdk.services.budgets.CfnBudget.Builder
      .create(stackCtx, internalResourceId)
      .budget(budget)
      .notificationsWithSubscribers(notificationsWithSubscribers.map(_.asJava).orNull)
      .build()
}
