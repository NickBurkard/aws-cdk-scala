package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BasePathMapping {

  def apply(
    internalResourceId: String,
    domainName: software.amazon.awscdk.services.apigateway.IDomainName,
    restApi: software.amazon.awscdk.services.apigateway.IRestApi,
    stage: Option[software.amazon.awscdk.services.apigateway.Stage] = None,
    basePath: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.BasePathMapping =
    software.amazon.awscdk.services.apigateway.BasePathMapping.Builder
      .create(stackCtx, internalResourceId)
      .domainName(domainName)
      .restApi(restApi)
      .stage(stage.orNull)
      .basePath(basePath.orNull)
      .build()
}
