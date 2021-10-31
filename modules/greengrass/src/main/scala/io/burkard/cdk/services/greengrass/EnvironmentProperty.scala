package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
