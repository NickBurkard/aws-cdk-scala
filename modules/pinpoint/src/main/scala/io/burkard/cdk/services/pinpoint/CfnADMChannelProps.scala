package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnADMChannelProps {

  def apply(
    clientId: Option[String] = None,
    clientSecret: Option[String] = None,
    applicationId: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpoint.CfnADMChannelProps =
    (new software.amazon.awscdk.services.pinpoint.CfnADMChannelProps.Builder)
      .clientId(clientId.orNull)
      .clientSecret(clientSecret.orNull)
      .applicationId(applicationId.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
