package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetPropertyTimestampProperty {

  def apply(
    timeInSeconds: String,
    offsetInNanos: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty.Builder)
      .timeInSeconds(timeInSeconds)
      .offsetInNanos(offsetInNanos.orNull)
      .build()
}
