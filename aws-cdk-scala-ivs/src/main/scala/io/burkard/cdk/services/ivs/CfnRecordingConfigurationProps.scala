package io.burkard.cdk.services.ivs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRecordingConfigurationProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    destinationConfiguration: Option[software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty] = None
  ): software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps =
    (new software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .destinationConfiguration(destinationConfiguration.orNull)
      .build()
}
