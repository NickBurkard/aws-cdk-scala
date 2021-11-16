package io.burkard.cdk.services.kinesisanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationV2Props {

  def apply(
    serviceExecutionRole: String,
    runtimeEnvironment: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    applicationName: Option[String] = None,
    applicationConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty] = None,
    applicationMode: Option[String] = None,
    applicationDescription: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder)
      .serviceExecutionRole(serviceExecutionRole)
      .runtimeEnvironment(runtimeEnvironment)
      .tags(tags.map(_.asJava).orNull)
      .applicationName(applicationName.orNull)
      .applicationConfiguration(applicationConfiguration.orNull)
      .applicationMode(applicationMode.orNull)
      .applicationDescription(applicationDescription.orNull)
      .build()
}
