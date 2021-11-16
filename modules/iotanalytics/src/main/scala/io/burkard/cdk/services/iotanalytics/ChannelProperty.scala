package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ChannelProperty {

  def apply(
    name: String,
    channelName: String,
    next: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder)
      .name(name)
      .channelName(channelName)
      .next(next.orNull)
      .build()
}
