package io.burkard.cdk.services.budgets

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SsmActionDefinitionProperty {

  def apply(
    instanceIds: Option[List[String]] = None,
    subtype: Option[String] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty.Builder)
      .instanceIds(instanceIds.map(_.asJava).orNull)
      .subtype(subtype.orNull)
      .region(region.orNull)
      .build()
}
