package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAPNSVoipChannelProps {

  def apply(
    applicationId: String,
    tokenKeyId: Option[String] = None,
    bundleId: Option[String] = None,
    certificate: Option[String] = None,
    teamId: Option[String] = None,
    tokenKey: Option[String] = None,
    privateKey: Option[String] = None,
    defaultAuthenticationMethod: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannelProps =
    (new software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannelProps.Builder)
      .applicationId(applicationId)
      .tokenKeyId(tokenKeyId.orNull)
      .bundleId(bundleId.orNull)
      .certificate(certificate.orNull)
      .teamId(teamId.orNull)
      .tokenKey(tokenKey.orNull)
      .privateKey(privateKey.orNull)
      .defaultAuthenticationMethod(defaultAuthenticationMethod.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
