package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiMappingProps {

  def apply(
    stage: String,
    domainName: String,
    apiId: String,
    apiMappingKey: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps.Builder)
      .stage(stage)
      .domainName(domainName)
      .apiId(apiId)
      .apiMappingKey(apiMappingKey.orNull)
      .build()
}
