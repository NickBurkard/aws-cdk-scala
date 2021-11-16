package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScpActionDefinitionProperty {

  def apply(
    targetIds: List[String],
    policyId: String
  ): software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty.Builder)
      .targetIds(targetIds.asJava)
      .policyId(policyId)
      .build()
}
