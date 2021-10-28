package io.burkard.cdk.services.kinesisanalytics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationV2Props {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    applicationName: Option[String] = None,
    applicationConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty] = None,
    applicationMode: Option[String] = None,
    applicationDescription: Option[String] = None,
    serviceExecutionRole: Option[String] = None,
    runtimeEnvironment: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder)
      .tags(tags.map(_.asJava).orNull)
      .applicationName(applicationName.orNull)
      .applicationConfiguration(applicationConfiguration.orNull)
      .applicationMode(applicationMode.orNull)
      .applicationDescription(applicationDescription.orNull)
      .serviceExecutionRole(serviceExecutionRole.orNull)
      .runtimeEnvironment(runtimeEnvironment.orNull)
      .build()
}
