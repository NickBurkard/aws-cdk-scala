package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSMSChannelProps {

  def apply(
    applicationId: String,
    shortCode: Option[String] = None,
    senderId: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps =
    (new software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps.Builder)
      .applicationId(applicationId)
      .shortCode(shortCode.orNull)
      .senderId(senderId.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
