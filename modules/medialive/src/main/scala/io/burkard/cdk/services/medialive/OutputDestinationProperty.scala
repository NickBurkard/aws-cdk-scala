package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputDestinationProperty {

  def apply(
    multiplexSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty] = None,
    mediaPackageSettings: Option[List[_]] = None,
    id: Option[String] = None,
    settings: Option[List[_]] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty.Builder)
      .multiplexSettings(multiplexSettings.orNull)
      .mediaPackageSettings(mediaPackageSettings.map(_.asJava).orNull)
      .id(id.orNull)
      .settings(settings.map(_.asJava).orNull)
      .build()
}
