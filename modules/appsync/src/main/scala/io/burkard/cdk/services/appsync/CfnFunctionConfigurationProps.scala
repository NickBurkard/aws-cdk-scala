package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFunctionConfigurationProps {

  def apply(
    dataSourceName: String,
    apiId: String,
    name: String,
    functionVersion: String,
    requestMappingTemplate: Option[String] = None,
    requestMappingTemplateS3Location: Option[String] = None,
    responseMappingTemplateS3Location: Option[String] = None,
    responseMappingTemplate: Option[String] = None,
    description: Option[String] = None,
    syncConfig: Option[software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty] = None
  ): software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps =
    (new software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder)
      .dataSourceName(dataSourceName)
      .apiId(apiId)
      .name(name)
      .functionVersion(functionVersion)
      .requestMappingTemplate(requestMappingTemplate.orNull)
      .requestMappingTemplateS3Location(requestMappingTemplateS3Location.orNull)
      .responseMappingTemplateS3Location(responseMappingTemplateS3Location.orNull)
      .responseMappingTemplate(responseMappingTemplate.orNull)
      .description(description.orNull)
      .syncConfig(syncConfig.orNull)
      .build()
}
