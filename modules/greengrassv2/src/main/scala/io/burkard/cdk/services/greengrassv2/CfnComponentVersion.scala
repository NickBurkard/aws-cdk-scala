package io.burkard.cdk.services.greengrassv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnComponentVersion {

  def apply(
    internalResourceId: String,
    inlineRecipe: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    lambdaFunction: Option[software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion =
    software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.Builder
      .create(stackCtx, internalResourceId)
      .inlineRecipe(inlineRecipe.orNull)
      .tags(tags.map(_.asJava).orNull)
      .lambdaFunction(lambdaFunction.orNull)
      .build()
}
