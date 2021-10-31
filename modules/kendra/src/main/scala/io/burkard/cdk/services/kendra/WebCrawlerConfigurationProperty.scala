package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WebCrawlerConfigurationProperty {

  def apply(
    urlExclusionPatterns: Option[List[String]] = None,
    urlInclusionPatterns: Option[List[String]] = None,
    urls: Option[software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty] = None,
    maxUrlsPerMinuteCrawlRate: Option[Number] = None,
    maxContentSizePerPageInMegaBytes: Option[Number] = None,
    proxyConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty] = None,
    authenticationConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty] = None,
    maxLinksPerPage: Option[Number] = None,
    crawlDepth: Option[Number] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty.Builder)
      .urlExclusionPatterns(urlExclusionPatterns.map(_.asJava).orNull)
      .urlInclusionPatterns(urlInclusionPatterns.map(_.asJava).orNull)
      .urls(urls.orNull)
      .maxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate.orNull)
      .maxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes.orNull)
      .proxyConfiguration(proxyConfiguration.orNull)
      .authenticationConfiguration(authenticationConfiguration.orNull)
      .maxLinksPerPage(maxLinksPerPage.orNull)
      .crawlDepth(crawlDepth.orNull)
      .build()
}
