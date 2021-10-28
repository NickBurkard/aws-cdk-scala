package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StreamSelectionProperty {

  def apply(
    minVideoBitsPerSecond: Option[Number] = None,
    streamOrder: Option[String] = None,
    maxVideoBitsPerSecond: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty.Builder)
      .minVideoBitsPerSecond(minVideoBitsPerSecond.orNull)
      .streamOrder(streamOrder.orNull)
      .maxVideoBitsPerSecond(maxVideoBitsPerSecond.orNull)
      .build()
}