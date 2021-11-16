package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiMappingV2Props {

  def apply(
    stage: String,
    domainName: String,
    apiId: String,
    apiMappingKey: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnApiMappingV2Props =
    (new software.amazon.awscdk.services.apigateway.CfnApiMappingV2Props.Builder)
      .stage(stage)
      .domainName(domainName)
      .apiId(apiId)
      .apiMappingKey(apiMappingKey.orNull)
      .build()
}
