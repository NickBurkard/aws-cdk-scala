package io.burkard.cdk.services.ssmcontacts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnContactChannel {

  def apply(
    internalResourceId: String,
    channelType: String,
    contactId: String,
    channelAddress: String,
    channelName: String,
    deferActivation: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssmcontacts.CfnContactChannel =
    software.amazon.awscdk.services.ssmcontacts.CfnContactChannel.Builder
      .create(stackCtx, internalResourceId)
      .channelType(channelType)
      .contactId(contactId)
      .channelAddress(channelAddress)
      .channelName(channelName)
      .deferActivation(deferActivation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
