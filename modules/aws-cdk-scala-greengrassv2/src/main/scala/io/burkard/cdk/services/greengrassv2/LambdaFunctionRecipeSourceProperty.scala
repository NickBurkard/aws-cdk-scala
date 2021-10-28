package io.burkard.cdk.services.greengrassv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
