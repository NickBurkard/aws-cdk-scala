package io.burkard.cdk.services.ssmcontacts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ChannelTargetInfoProperty {

  def apply(
    retryIntervalInMinutes: Option[Number] = None,
    channelId: Option[String] = None
  ): software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty =
    (new software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty.Builder)
      .retryIntervalInMinutes(retryIntervalInMinutes.orNull)
      .channelId(channelId.orNull)
      .build()
}
