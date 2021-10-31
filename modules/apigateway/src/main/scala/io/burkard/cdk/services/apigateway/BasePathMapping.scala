package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BasePathMapping {

  def apply(
    internalResourceId: String,
    stage: Option[software.amazon.awscdk.services.apigateway.Stage] = None,
    basePath: Option[String] = None,
    domainName: Option[software.amazon.awscdk.services.apigateway.IDomainName] = None,
    restApi: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.BasePathMapping =
    software.amazon.awscdk.services.apigateway.BasePathMapping.Builder
      .create(stackCtx, internalResourceId)
      .stage(stage.orNull)
      .basePath(basePath.orNull)
      .domainName(domainName.orNull)
      .restApi(restApi.orNull)
      .build()
}
