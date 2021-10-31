package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSMSChannelProps {

  def apply(
    shortCode: Option[String] = None,
    senderId: Option[String] = None,
    applicationId: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps =
    (new software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps.Builder)
      .shortCode(shortCode.orNull)
      .senderId(senderId.orNull)
      .applicationId(applicationId.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
