package io.burkard.cdk.services.ssmcontacts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnContactChannelProps {

  def apply(
    channelType: String,
    contactId: String,
    channelAddress: String,
    channelName: String,
    deferActivation: Option[Boolean] = None
  ): software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps =
    (new software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps.Builder)
      .channelType(channelType)
      .contactId(contactId)
      .channelAddress(channelAddress)
      .channelName(channelName)
      .deferActivation(deferActivation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
