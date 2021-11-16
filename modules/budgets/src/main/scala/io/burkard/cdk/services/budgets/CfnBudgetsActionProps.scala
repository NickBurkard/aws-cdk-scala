package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBudgetsActionProps {

  def apply(
    budgetName: String,
    subscribers: List[_],
    actionThreshold: software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty,
    executionRoleArn: String,
    definition: software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty,
    actionType: String,
    notificationType: String,
    approvalModel: Option[String] = None
  ): software.amazon.awscdk.services.budgets.CfnBudgetsActionProps =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsActionProps.Builder)
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
