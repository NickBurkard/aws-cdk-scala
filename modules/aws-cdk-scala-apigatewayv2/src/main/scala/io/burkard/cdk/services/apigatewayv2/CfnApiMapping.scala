package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApiMapping {

  def apply(
    internalResourceId: String,
    stage: Option[String] = None,
    apiMappingKey: Option[String] = None,
    domainName: Option[String] = None,
    apiId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnApiMapping =
    software.amazon.awscdk.services.apigatewayv2.CfnApiMapping.Builder
      .create(stackCtx, internalResourceId)
      .stage(stage.orNull)
      .apiMappingKey(apiMappingKey.orNull)
      .domainName(domainName.orNull)
      .apiId(apiId.orNull)
      .build()
}
