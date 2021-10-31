package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConditionExpressionProperty {

  def apply(
    condition: Option[String] = None,
    value: Option[String] = None,
    targetColumn: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty =
    (new software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty.Builder)
      .condition(condition.orNull)
      .value(value.orNull)
      .targetColumn(targetColumn.orNull)
      .build()
}
