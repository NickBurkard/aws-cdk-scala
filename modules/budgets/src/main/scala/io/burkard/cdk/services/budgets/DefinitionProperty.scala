package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefinitionProperty {

  def apply(
    scpActionDefinition: Option[software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty] = None,
    iamActionDefinition: Option[software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty] = None,
    ssmActionDefinition: Option[software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty] = None
  ): software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty.Builder)
      .scpActionDefinition(scpActionDefinition.orNull)
      .iamActionDefinition(iamActionDefinition.orNull)
      .ssmActionDefinition(ssmActionDefinition.orNull)
      .build()
}
