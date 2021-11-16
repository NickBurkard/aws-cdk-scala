package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConditionExpressionProperty {

  def apply(
    condition: String,
    targetColumn: String,
    value: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty =
    (new software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty.Builder)
      .condition(condition)
      .targetColumn(targetColumn)
      .value(value.orNull)
      .build()
}
