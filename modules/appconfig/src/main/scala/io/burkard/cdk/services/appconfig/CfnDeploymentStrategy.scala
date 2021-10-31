package io.burkard.cdk.services.appconfig

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeploymentStrategy {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    growthType: Option[String] = None,
    finalBakeTimeInMinutes: Option[Number] = None,
    replicateTo: Option[String] = None,
    growthFactor: Option[Number] = None,
    deploymentDurationInMinutes: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy.TagsProperty]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy =
    software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .growthType(growthType.orNull)
      .finalBakeTimeInMinutes(finalBakeTimeInMinutes.orNull)
      .replicateTo(replicateTo.orNull)
      .growthFactor(growthFactor.orNull)
      .deploymentDurationInMinutes(deploymentDurationInMinutes.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
