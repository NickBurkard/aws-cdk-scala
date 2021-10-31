package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WebCrawlerSeedUrlConfigurationProperty {

  def apply(
    seedUrls: Option[List[String]] = None,
    webCrawlerMode: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.Builder)
      .seedUrls(seedUrls.map(_.asJava).orNull)
      .webCrawlerMode(webCrawlerMode.orNull)
      .build()
}
