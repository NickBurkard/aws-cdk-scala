package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVoiceChannel {

  def apply(
    internalResourceId: String,
    applicationId: Option[String] = None,
    enabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnVoiceChannel =
    software.amazon.awscdk.services.pinpoint.CfnVoiceChannel.Builder
      .create(stackCtx, internalResourceId)
      .applicationId(applicationId.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
