package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputDestinationRequestProperty {

  def apply(
    streamName: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty =
    (new software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty.Builder)
      .streamName(streamName.orNull)
      .build()
}
