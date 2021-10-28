package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WebCrawlerAuthenticationConfigurationProperty {

  def apply(
    basicAuthentication: Option[List[_]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.Builder)
      .basicAuthentication(basicAuthentication.map(_.asJava).orNull)
      .build()
}
