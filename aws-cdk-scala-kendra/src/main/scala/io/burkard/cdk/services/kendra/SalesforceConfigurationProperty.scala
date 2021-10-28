package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SalesforceConfigurationProperty {

  def apply(
    excludeAttachmentFilePatterns: Option[List[String]] = None,
    serverUrl: Option[String] = None,
    includeAttachmentFilePatterns: Option[List[String]] = None,
    standardObjectAttachmentConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty] = None,
    standardObjectConfigurations: Option[List[_]] = None,
    knowledgeArticleConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty] = None,
    crawlAttachments: Option[Boolean] = None,
    chatterFeedConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty] = None,
    secretArn: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty.Builder)
      .excludeAttachmentFilePatterns(excludeAttachmentFilePatterns.map(_.asJava).orNull)
      .serverUrl(serverUrl.orNull)
      .includeAttachmentFilePatterns(includeAttachmentFilePatterns.map(_.asJava).orNull)
      .standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration.orNull)
      .standardObjectConfigurations(standardObjectConfigurations.map(_.asJava).orNull)
      .knowledgeArticleConfiguration(knowledgeArticleConfiguration.orNull)
      .crawlAttachments(crawlAttachments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .chatterFeedConfiguration(chatterFeedConfiguration.orNull)
      .secretArn(secretArn.orNull)
      .build()
}
