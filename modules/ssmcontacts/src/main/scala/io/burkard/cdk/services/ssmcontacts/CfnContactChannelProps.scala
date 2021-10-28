package io.burkard.cdk.services.ssmcontacts

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnContactChannelProps {

  def apply(
    channelType: Option[String] = None,
    contactId: Option[String] = None,
    deferActivation: Option[Boolean] = None,
    channelAddress: Option[String] = None,
    channelName: Option[String] = None
  ): software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps =
    (new software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps.Builder)
      .channelType(channelType.orNull)
      .contactId(contactId.orNull)
      .deferActivation(deferActivation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .channelAddress(channelAddress.orNull)
      .channelName(channelName.orNull)
      .build()
}
