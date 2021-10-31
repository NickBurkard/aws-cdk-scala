package io.burkard.cdk.services.ivs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRecordingConfiguration {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    destinationConfiguration: Option[software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ivs.CfnRecordingConfiguration =
    software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .destinationConfiguration(destinationConfiguration.orNull)
      .build()
}
