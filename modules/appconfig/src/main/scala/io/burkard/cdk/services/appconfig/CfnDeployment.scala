package io.burkard.cdk.services.appconfig

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeployment {

  def apply(
    internalResourceId: String,
    applicationId: String,
    deploymentStrategyId: String,
    environmentId: String,
    configurationVersion: String,
    configurationProfileId: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnDeployment.TagsProperty]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appconfig.CfnDeployment =
    software.amazon.awscdk.services.appconfig.CfnDeployment.Builder
      .create(stackCtx, internalResourceId)
      .applicationId(applicationId)
      .deploymentStrategyId(deploymentStrategyId)
      .environmentId(environmentId)
      .configurationVersion(configurationVersion)
      .configurationProfileId(configurationProfileId)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
