package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverProps {

  def apply(
    pipelineConfig: Option[software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty] = None,
    responseMappingTemplate: Option[String] = None,
    requestMappingTemplate: Option[String] = None,
    syncConfig: Option[software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty] = None,
    requestMappingTemplateS3Location: Option[String] = None,
    typeName: Option[String] = None,
    dataSourceName: Option[String] = None,
    fieldName: Option[String] = None,
    apiId: Option[String] = None,
    responseMappingTemplateS3Location: Option[String] = None,
    kind: Option[String] = None,
    cachingConfig: Option[software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty] = None
  ): software.amazon.awscdk.services.appsync.CfnResolverProps =
    (new software.amazon.awscdk.services.appsync.CfnResolverProps.Builder)
      .pipelineConfig(pipelineConfig.orNull)
      .responseMappingTemplate(responseMappingTemplate.orNull)
      .requestMappingTemplate(requestMappingTemplate.orNull)
      .syncConfig(syncConfig.orNull)
      .requestMappingTemplateS3Location(requestMappingTemplateS3Location.orNull)
      .typeName(typeName.orNull)
      .dataSourceName(dataSourceName.orNull)
      .fieldName(fieldName.orNull)
      .apiId(apiId.orNull)
      .responseMappingTemplateS3Location(responseMappingTemplateS3Location.orNull)
      .kind(kind.orNull)
      .cachingConfig(cachingConfig.orNull)
      .build()
}
