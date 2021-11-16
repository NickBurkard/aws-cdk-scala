package io.burkard.cdk.services.ivs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRecordingConfigurationProps {

  def apply(
    destinationConfiguration: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps =
    (new software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps.Builder)
      .destinationConfiguration(destinationConfiguration)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
