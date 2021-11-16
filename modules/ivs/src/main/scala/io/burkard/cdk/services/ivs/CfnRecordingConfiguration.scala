package io.burkard.cdk.services.ivs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRecordingConfiguration {

  def apply(
    internalResourceId: String,
    destinationConfiguration: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ivs.CfnRecordingConfiguration =
    software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .destinationConfiguration(destinationConfiguration)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
