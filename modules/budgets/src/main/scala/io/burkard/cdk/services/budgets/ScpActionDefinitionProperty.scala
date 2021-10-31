package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScpActionDefinitionProperty {

  def apply(
    targetIds: Option[List[String]] = None,
    policyId: Option[String] = None
  ): software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty.Builder)
      .targetIds(targetIds.map(_.asJava).orNull)
      .policyId(policyId.orNull)
      .build()
}
