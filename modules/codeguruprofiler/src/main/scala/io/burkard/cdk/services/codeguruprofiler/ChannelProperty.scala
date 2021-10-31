package io.burkard.cdk.services.codeguruprofiler

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ChannelProperty {

  def apply(
    channelUri: Option[String] = None,
    channelId: Option[String] = None
  ): software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty =
    (new software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty.Builder)
      .channelUri(channelUri.orNull)
      .channelId(channelId.orNull)
      .build()
}
