package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataSourceConfigurationProperty {

  def apply(
    workDocsConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty] = None,
    sharePointConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty] = None,
    serviceNowConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty] = None,
    s3Configuration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty] = None,
    confluenceConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty] = None,
    webCrawlerConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty] = None,
    oneDriveConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty] = None,
    salesforceConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty] = None,
    databaseConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty] = None,
    googleDriveConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty.Builder)
      .workDocsConfiguration(workDocsConfiguration.orNull)
      .sharePointConfiguration(sharePointConfiguration.orNull)
      .serviceNowConfiguration(serviceNowConfiguration.orNull)
      .s3Configuration(s3Configuration.orNull)
      .confluenceConfiguration(confluenceConfiguration.orNull)
      .webCrawlerConfiguration(webCrawlerConfiguration.orNull)
      .oneDriveConfiguration(oneDriveConfiguration.orNull)
      .salesforceConfiguration(salesforceConfiguration.orNull)
      .databaseConfiguration(databaseConfiguration.orNull)
      .googleDriveConfiguration(googleDriveConfiguration.orNull)
      .build()
}
