package io.burkard.cdk.services.budgets

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBudgetsAction {

  def apply(
    internalResourceId: String,
    approvalModel: Option[String] = None,
    budgetName: Option[String] = None,
    subscribers: Option[List[_]] = None,
    actionThreshold: Option[software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty] = None,
    executionRoleArn: Option[String] = None,
    definition: Option[software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty] = None,
    actionType: Option[String] = None,
    notificationType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.budgets.CfnBudgetsAction =
    software.amazon.awscdk.services.budgets.CfnBudgetsAction.Builder
      .create(stackCtx, internalResourceId)
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
