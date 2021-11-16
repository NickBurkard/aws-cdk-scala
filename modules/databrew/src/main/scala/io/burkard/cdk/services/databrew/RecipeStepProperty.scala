package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecipeStepProperty {

  def apply(
    action: software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty,
    conditionExpressions: Option[List[_]] = None
  ): software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty =
    (new software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty.Builder)
      .action(action)
      .conditionExpressions(conditionExpressions.map(_.asJava).orNull)
      .build()
}
