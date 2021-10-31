package io.burkard.cdk.services.appconfig

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeploymentProps {

  def apply(
    applicationId: Option[String] = None,
    deploymentStrategyId: Option[String] = None,
    environmentId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnDeployment.TagsProperty]] = None,
    configurationVersion: Option[String] = None,
    configurationProfileId: Option[String] = None
  ): software.amazon.awscdk.services.appconfig.CfnDeploymentProps =
    (new software.amazon.awscdk.services.appconfig.CfnDeploymentProps.Builder)
      .applicationId(applicationId.orNull)
      .deploymentStrategyId(deploymentStrategyId.orNull)
      .environmentId(environmentId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .configurationVersion(configurationVersion.orNull)
      .configurationProfileId(configurationProfileId.orNull)
      .build()
}
