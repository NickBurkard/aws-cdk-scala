package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BasePathMappingProps {

  def apply(
    stage: Option[software.amazon.awscdk.services.apigateway.Stage] = None,
    basePath: Option[String] = None,
    domainName: Option[software.amazon.awscdk.services.apigateway.IDomainName] = None,
    restApi: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None
  ): software.amazon.awscdk.services.apigateway.BasePathMappingProps =
    (new software.amazon.awscdk.services.apigateway.BasePathMappingProps.Builder)
      .stage(stage.orNull)
      .basePath(basePath.orNull)
      .domainName(domainName.orNull)
      .restApi(restApi.orNull)
      .build()
}
