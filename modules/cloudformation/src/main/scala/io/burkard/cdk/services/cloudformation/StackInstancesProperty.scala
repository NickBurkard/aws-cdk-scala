package io.burkard.cdk.services.cloudformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StackInstancesProperty {

  def apply(
    regions: Option[List[String]] = None,
    deploymentTargets: Option[software.amazon.awscdk.services.cloudformation.CfnStackSet.DeploymentTargetsProperty] = None,
    parameterOverrides: Option[List[_]] = None
  ): software.amazon.awscdk.services.cloudformation.CfnStackSet.StackInstancesProperty =
    (new software.amazon.awscdk.services.cloudformation.CfnStackSet.StackInstancesProperty.Builder)
      .regions(regions.map(_.asJava).orNull)
      .deploymentTargets(deploymentTargets.orNull)
      .parameterOverrides(parameterOverrides.map(_.asJava).orNull)
      .build()
}
