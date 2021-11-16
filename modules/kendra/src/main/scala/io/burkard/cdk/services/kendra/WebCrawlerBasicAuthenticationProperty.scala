package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WebCrawlerBasicAuthenticationProperty {

  def apply(
    host: String,
    port: Number,
    credentials: String
  ): software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty.Builder)
      .host(host)
      .port(port)
      .credentials(credentials)
      .build()
}
