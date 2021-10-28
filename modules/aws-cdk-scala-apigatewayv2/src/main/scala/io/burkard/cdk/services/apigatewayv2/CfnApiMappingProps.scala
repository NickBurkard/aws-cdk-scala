package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApiMappingProps {

  def apply(
    stage: Option[String] = None,
    apiMappingKey: Option[String] = None,
    domainName: Option[String] = None,
    apiId: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps.Builder)
      .stage(stage.orNull)
      .apiMappingKey(apiMappingKey.orNull)
      .domainName(domainName.orNull)
      .apiId(apiId.orNull)
      .build()
}
