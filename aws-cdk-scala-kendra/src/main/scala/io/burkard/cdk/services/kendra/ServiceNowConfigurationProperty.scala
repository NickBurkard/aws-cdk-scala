package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServiceNowConfigurationProperty {

  def apply(
    serviceNowBuildVersion: Option[String] = None,
    authenticationType: Option[String] = None,
    serviceCatalogConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty] = None,
    hostUrl: Option[String] = None,
    knowledgeArticleConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty] = None,
    secretArn: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty.Builder)
      .serviceNowBuildVersion(serviceNowBuildVersion.orNull)
      .authenticationType(authenticationType.orNull)
      .serviceCatalogConfiguration(serviceCatalogConfiguration.orNull)
      .hostUrl(hostUrl.orNull)
      .knowledgeArticleConfiguration(knowledgeArticleConfiguration.orNull)
      .secretArn(secretArn.orNull)
      .build()
}
