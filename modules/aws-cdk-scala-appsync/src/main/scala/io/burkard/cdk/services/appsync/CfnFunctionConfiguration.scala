package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFunctionConfiguration {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appsync.CfnFunctionConfiguration =
    software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.Builder
      .create(stackCtx, internalResourceId)
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
