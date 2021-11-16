package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProxyConfigurationProperty {

  def apply(
    host: String,
    port: Number,
    credentials: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty.Builder)
      .host(host)
      .port(port)
      .credentials(credentials.orNull)
      .build()
}
