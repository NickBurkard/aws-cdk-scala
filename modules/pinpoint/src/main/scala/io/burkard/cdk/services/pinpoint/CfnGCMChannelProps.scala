package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGCMChannelProps {

  def apply(
    apiKey: String,
    applicationId: String,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps =
    (new software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps.Builder)
      .apiKey(apiKey)
      .applicationId(applicationId)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
