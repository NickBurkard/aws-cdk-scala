package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SslConfigurationProperty {

  def apply(
    certificate: Option[String] = None,
    privateKey: Option[String] = None,
    chain: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty =
    (new software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder)
      .certificate(certificate.orNull)
      .privateKey(privateKey.orNull)
      .chain(chain.orNull)
      .build()
}
