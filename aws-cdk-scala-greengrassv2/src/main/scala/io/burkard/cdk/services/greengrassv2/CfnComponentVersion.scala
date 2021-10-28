package io.burkard.cdk.services.greengrassv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
