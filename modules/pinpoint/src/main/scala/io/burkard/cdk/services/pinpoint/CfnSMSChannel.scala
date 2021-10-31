package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSMSChannel {

  def apply(
    internalResourceId: String,
    shortCode: Option[String] = None,
    senderId: Option[String] = None,
    applicationId: Option[String] = None,
    enabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnSMSChannel =
    software.amazon.awscdk.services.pinpoint.CfnSMSChannel.Builder
      .create(stackCtx, internalResourceId)
      .shortCode(shortCode.orNull)
      .senderId(senderId.orNull)
      .applicationId(applicationId.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
