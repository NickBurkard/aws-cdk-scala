package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProxyConfigurationProperty {

  def apply(
    host: Option[String] = None,
    port: Option[Number] = None,
    credentials: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty.Builder)
      .host(host.orNull)
      .port(port.orNull)
      .credentials(credentials.orNull)
      .build()
}
