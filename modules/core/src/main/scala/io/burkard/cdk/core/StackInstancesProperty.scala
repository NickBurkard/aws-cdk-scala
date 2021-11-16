package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StackInstancesProperty {

  def apply(
    regions: List[String],
    deploymentTargets: software.amazon.awscdk.CfnStackSet.DeploymentTargetsProperty,
    parameterOverrides: Option[List[_]] = None
  ): software.amazon.awscdk.CfnStackSet.StackInstancesProperty =
    (new software.amazon.awscdk.CfnStackSet.StackInstancesProperty.Builder)
      .regions(regions.asJava)
      .deploymentTargets(deploymentTargets)
      .parameterOverrides(parameterOverrides.map(_.asJava).orNull)
      .build()
}
