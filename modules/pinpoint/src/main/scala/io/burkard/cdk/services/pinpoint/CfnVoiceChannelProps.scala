package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVoiceChannelProps {

  def apply(
    applicationId: String,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps =
    (new software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps.Builder)
      .applicationId(applicationId)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
