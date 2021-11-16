package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BasePathMappingProps {

  def apply(
    domainName: software.amazon.awscdk.services.apigateway.IDomainName,
    restApi: software.amazon.awscdk.services.apigateway.IRestApi,
    stage: Option[software.amazon.awscdk.services.apigateway.Stage] = None,
    basePath: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.BasePathMappingProps =
    (new software.amazon.awscdk.services.apigateway.BasePathMappingProps.Builder)
      .domainName(domainName)
      .restApi(restApi)
      .stage(stage.orNull)
      .basePath(basePath.orNull)
      .build()
}
