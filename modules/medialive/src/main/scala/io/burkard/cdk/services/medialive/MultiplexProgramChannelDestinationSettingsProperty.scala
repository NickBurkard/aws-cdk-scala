package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MultiplexProgramChannelDestinationSettingsProperty {

  def apply(
    multiplexId: Option[String] = None,
    programName: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty.Builder)
      .multiplexId(multiplexId.orNull)
      .programName(programName.orNull)
      .build()
}
