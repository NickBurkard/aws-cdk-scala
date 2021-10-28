package io.burkard.cdk.services.databrew

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RecipeStepProperty {

  def apply(
    conditionExpressions: Option[List[_]] = None,
    action: Option[software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty =
    (new software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty.Builder)
      .conditionExpressions(conditionExpressions.map(_.asJava).orNull)
      .action(action.orNull)
      .build()
}
