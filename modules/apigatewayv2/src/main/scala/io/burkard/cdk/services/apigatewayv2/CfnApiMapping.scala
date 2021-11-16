package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiMapping {

  def apply(
    internalResourceId: String,
    stage: String,
    domainName: String,
    apiId: String,
    apiMappingKey: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnApiMapping =
    software.amazon.awscdk.services.apigatewayv2.CfnApiMapping.Builder
      .create(stackCtx, internalResourceId)
      .stage(stage)
      .domainName(domainName)
      .apiId(apiId)
      .apiMappingKey(apiMappingKey.orNull)
      .build()
}
