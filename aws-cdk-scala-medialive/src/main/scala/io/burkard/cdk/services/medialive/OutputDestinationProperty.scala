package io.burkard.cdk.services.medialive

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
