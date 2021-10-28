package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MultiplexOutputSettingsProperty {

  def apply(
    destination: Option[software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty.Builder)
      .destination(destination.orNull)
      .build()
}
