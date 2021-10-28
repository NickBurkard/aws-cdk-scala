package io.burkard.cdk.services.ssmcontacts

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnContactChannel {

  def apply(
    internalResourceId: String,
    channelType: Option[String] = None,
    contactId: Option[String] = None,
    deferActivation: Option[Boolean] = None,
    channelAddress: Option[String] = None,
    channelName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssmcontacts.CfnContactChannel =
    software.amazon.awscdk.services.ssmcontacts.CfnContactChannel.Builder
      .create(stackCtx, internalResourceId)
      .channelType(channelType.orNull)
      .contactId(contactId.orNull)
      .deferActivation(deferActivation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .channelAddress(channelAddress.orNull)
      .channelName(channelName.orNull)
      .build()
}
