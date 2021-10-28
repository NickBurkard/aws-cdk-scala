package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StackInstancesProperty {

  def apply(
    regions: Option[List[String]] = None,
    deploymentTargets: Option[software.amazon.awscdk.CfnStackSet.DeploymentTargetsProperty] = None,
    parameterOverrides: Option[List[_]] = None
  ): software.amazon.awscdk.CfnStackSet.StackInstancesProperty =
    (new software.amazon.awscdk.CfnStackSet.StackInstancesProperty.Builder)
      .regions(regions.map(_.asJava).orNull)
      .deploymentTargets(deploymentTargets.orNull)
      .parameterOverrides(parameterOverrides.map(_.asJava).orNull)
      .build()
}
