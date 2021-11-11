package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedisSettingsProperty {

  def apply(
    sslSecurityProtocol: Option[String] = None,
    serverName: Option[String] = None,
    sslCaCertificateArn: Option[String] = None,
    authType: Option[String] = None,
    port: Option[Number] = None,
    authUserName: Option[String] = None,
    authPassword: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty.Builder)
      .sslSecurityProtocol(sslSecurityProtocol.orNull)
      .serverName(serverName.orNull)
      .sslCaCertificateArn(sslCaCertificateArn.orNull)
      .authType(authType.orNull)
      .port(port.orNull)
      .authUserName(authUserName.orNull)
      .authPassword(authPassword.orNull)
      .build()
}
