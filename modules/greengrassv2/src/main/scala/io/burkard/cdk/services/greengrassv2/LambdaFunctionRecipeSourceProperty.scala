package io.burkard.cdk.services.greengrassv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaFunctionRecipeSourceProperty {

  def apply(
    componentLambdaParameters: Option[software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty] = None,
    lambdaArn: Option[String] = None,
    componentName: Option[String] = None,
    componentDependencies: Option[Map[String, _]] = None,
    componentVersion: Option[String] = None,
    componentPlatforms: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty =
    (new software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty.Builder)
      .componentLambdaParameters(componentLambdaParameters.orNull)
      .lambdaArn(lambdaArn.orNull)
      .componentName(componentName.orNull)
      .componentDependencies(componentDependencies.map(_.asJava).orNull)
      .componentVersion(componentVersion.orNull)
      .componentPlatforms(componentPlatforms.map(_.asJava).orNull)
      .build()
}
