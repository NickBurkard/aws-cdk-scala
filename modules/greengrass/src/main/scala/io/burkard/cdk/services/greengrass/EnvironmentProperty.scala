package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentProperty {

  def apply(
    execution: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty] = None,
    resourceAccessPolicies: Option[List[_]] = None,
    variables: Option[AnyRef] = None,
    accessSysfs: Option[Boolean] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty.Builder)
      .execution(execution.orNull)
      .resourceAccessPolicies(resourceAccessPolicies.map(_.asJava).orNull)
      .variables(variables.orNull)
      .accessSysfs(accessSysfs.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
