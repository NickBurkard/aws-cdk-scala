package io.burkard.cdk.services.appconfig

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeploymentProps {

  def apply(
    applicationId: String,
    deploymentStrategyId: String,
    environmentId: String,
    configurationVersion: String,
    configurationProfileId: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnDeployment.TagsProperty]] = None
  ): software.amazon.awscdk.services.appconfig.CfnDeploymentProps =
    (new software.amazon.awscdk.services.appconfig.CfnDeploymentProps.Builder)
      .applicationId(applicationId)
      .deploymentStrategyId(deploymentStrategyId)
      .environmentId(environmentId)
      .configurationVersion(configurationVersion)
      .configurationProfileId(configurationProfileId)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
