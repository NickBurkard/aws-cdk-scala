package io.burkard.cdk.services.ssmcontacts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetsProperty {

  def apply(
    channelTargetInfo: Option[software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty] = None,
    contactTargetInfo: Option[software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty] = None
  ): software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty =
    (new software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty.Builder)
      .channelTargetInfo(channelTargetInfo.orNull)
      .contactTargetInfo(contactTargetInfo.orNull)
      .build()
}
