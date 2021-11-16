package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBudgetsAction {

  def apply(
    internalResourceId: String,
    budgetName: String,
    subscribers: List[_],
    actionThreshold: software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty,
    executionRoleArn: String,
    definition: software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty,
    actionType: String,
    notificationType: String,
    approvalModel: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.budgets.CfnBudgetsAction =
    software.amazon.awscdk.services.budgets.CfnBudgetsAction.Builder
      .create(stackCtx, internalResourceId)
      .budgetName(budgetName)
      .subscribers(subscribers.asJava)
      .actionThreshold(actionThreshold)
      .executionRoleArn(executionRoleArn)
      .definition(definition)
      .actionType(actionType)
      .notificationType(notificationType)
      .approvalModel(approvalModel.orNull)
      .build()
}
