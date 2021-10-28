package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ChannelProperty {

  def apply(
    name: Option[String] = None,
    channelName: Option[String] = None,
    next: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder)
      .name(name.orNull)
      .channelName(channelName.orNull)
      .next(next.orNull)
      .build()
}
