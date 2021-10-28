package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFunctionConfigurationProps {

  def apply(
    requestMappingTemplate: Option[String] = None,
    requestMappingTemplateS3Location: Option[String] = None,
    dataSourceName: Option[String] = None,
    apiId: Option[String] = None,
    responseMappingTemplateS3Location: Option[String] = None,
    name: Option[String] = None,
    responseMappingTemplate: Option[String] = None,
    description: Option[String] = None,
    syncConfig: Option[software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty] = None,
    functionVersion: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps =
    (new software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder)
      .requestMappingTemplate(requestMappingTemplate.orNull)
      .requestMappingTemplateS3Location(requestMappingTemplateS3Location.orNull)
      .dataSourceName(dataSourceName.orNull)
      .apiId(apiId.orNull)
      .responseMappingTemplateS3Location(responseMappingTemplateS3Location.orNull)
      .name(name.orNull)
      .responseMappingTemplate(responseMappingTemplate.orNull)
      .description(description.orNull)
      .syncConfig(syncConfig.orNull)
      .functionVersion(functionVersion.orNull)
      .build()
}
