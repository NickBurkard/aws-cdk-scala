package io.burkard.cdk.services.greengrassv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnComponentVersionProps {

  def apply(
    inlineRecipe: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    lambdaFunction: Option[software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty] = None
  ): software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps =
    (new software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps.Builder)
      .inlineRecipe(inlineRecipe.orNull)
      .tags(tags.map(_.asJava).orNull)
      .lambdaFunction(lambdaFunction.orNull)
      .build()
}
