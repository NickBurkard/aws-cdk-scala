package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiMappingV2Props {

  def apply(
    stage: Option[String] = None,
    apiMappingKey: Option[String] = None,
    domainName: Option[String] = None,
    apiId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnApiMappingV2Props =
    (new software.amazon.awscdk.services.apigateway.CfnApiMappingV2Props.Builder)
      .stage(stage.orNull)
      .apiMappingKey(apiMappingKey.orNull)
      .domainName(domainName.orNull)
      .apiId(apiId.orNull)
      .build()
}
