package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnADMChannelProps {

  def apply(
    clientId: String,
    clientSecret: String,
    applicationId: String,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpoint.CfnADMChannelProps =
    (new software.amazon.awscdk.services.pinpoint.CfnADMChannelProps.Builder)
      .clientId(clientId)
      .clientSecret(clientSecret)
      .applicationId(applicationId)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
