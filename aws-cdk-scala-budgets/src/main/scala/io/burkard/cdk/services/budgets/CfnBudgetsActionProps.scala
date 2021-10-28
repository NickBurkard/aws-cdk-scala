package io.burkard.cdk.services.budgets

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBudgetsActionProps {

  def apply(
    approvalModel: Option[String] = None,
    budgetName: Option[String] = None,
    subscribers: Option[List[_]] = None,
    actionThreshold: Option[software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty] = None,
    executionRoleArn: Option[String] = None,
    definition: Option[software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty] = None,
    actionType: Option[String] = None,
    notificationType: Option[String] = None
  ): software.amazon.awscdk.services.budgets.CfnBudgetsActionProps =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsActionProps.Builder)
      .approvalModel(approvalModel.orNull)
      .budgetName(budgetName.orNull)
      .subscribers(subscribers.map(_.asJava).orNull)
      .actionThreshold(actionThreshold.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .definition(definition.orNull)
      .actionType(actionType.orNull)
      .notificationType(notificationType.orNull)
      .build()
}
