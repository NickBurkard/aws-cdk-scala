package io.burkard.cdk.services.appconfig

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeploymentStrategyProps {

  def apply(
    name: String,
    replicateTo: String,
    growthFactor: Number,
    deploymentDurationInMinutes: Number,
    growthType: Option[String] = None,
    finalBakeTimeInMinutes: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy.TagsProperty]] = None
  ): software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps =
    (new software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps.Builder)
      .name(name)
      .replicateTo(replicateTo)
      .growthFactor(growthFactor)
      .deploymentDurationInMinutes(deploymentDurationInMinutes)
      .growthType(growthType.orNull)
      .finalBakeTimeInMinutes(finalBakeTimeInMinutes.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
