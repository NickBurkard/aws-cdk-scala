package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputDestinationRequestProperty {

  def apply(
    streamName: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty =
    (new software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty.Builder)
      .streamName(streamName.orNull)
      .build()
}
