package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceNowConfigurationProperty {

  def apply(
    serviceNowBuildVersion: String,
    hostUrl: String,
    secretArn: String,
    authenticationType: Option[String] = None,
    serviceCatalogConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty] = None,
    knowledgeArticleConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty.Builder)
      .serviceNowBuildVersion(serviceNowBuildVersion)
      .hostUrl(hostUrl)
      .secretArn(secretArn)
      .authenticationType(authenticationType.orNull)
      .serviceCatalogConfiguration(serviceCatalogConfiguration.orNull)
      .knowledgeArticleConfiguration(knowledgeArticleConfiguration.orNull)
      .build()
}
