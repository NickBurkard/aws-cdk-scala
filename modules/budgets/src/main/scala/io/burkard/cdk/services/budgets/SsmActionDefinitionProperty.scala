package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SsmActionDefinitionProperty {

  def apply(
    instanceIds: List[String],
    subtype: String,
    region: String
  ): software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty.Builder)
      .instanceIds(instanceIds.asJava)
      .subtype(subtype)
      .region(region)
      .build()
}
