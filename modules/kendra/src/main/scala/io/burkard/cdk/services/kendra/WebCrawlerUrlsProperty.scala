package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WebCrawlerUrlsProperty {

  def apply(
    siteMapsConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty] = None,
    seedUrlConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty.Builder)
      .siteMapsConfiguration(siteMapsConfiguration.orNull)
      .seedUrlConfiguration(seedUrlConfiguration.orNull)
      .build()
}
