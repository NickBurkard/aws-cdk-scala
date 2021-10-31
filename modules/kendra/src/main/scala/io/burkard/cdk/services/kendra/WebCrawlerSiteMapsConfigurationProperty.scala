package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WebCrawlerSiteMapsConfigurationProperty {

  def apply(
    siteMaps: Option[List[String]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty.Builder)
      .siteMaps(siteMaps.map(_.asJava).orNull)
      .build()
}
