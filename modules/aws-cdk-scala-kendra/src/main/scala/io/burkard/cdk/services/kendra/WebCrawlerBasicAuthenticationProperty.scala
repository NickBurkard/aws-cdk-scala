package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WebCrawlerBasicAuthenticationProperty {

  def apply(
    host: Option[String] = None,
    port: Option[Number] = None,
    credentials: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty.Builder)
      .host(host.orNull)
      .port(port.orNull)
      .credentials(credentials.orNull)
      .build()
}
