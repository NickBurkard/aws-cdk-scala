package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WebCrawlerAuthenticationConfigurationProperty {

  def apply(
    basicAuthentication: Option[List[_]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.Builder)
      .basicAuthentication(basicAuthentication.map(_.asJava).orNull)
      .build()
}
