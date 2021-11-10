package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiMappingV2 {

  def apply(
    internalResourceId: String,
    stage: Option[String] = None,
    apiMappingKey: Option[String] = None,
    domainName: Option[String] = None,
    apiId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnApiMappingV2 =
    software.amazon.awscdk.services.apigateway.CfnApiMappingV2.Builder
      .create(stackCtx, internalResourceId)
      .stage(stage.orNull)
      .apiMappingKey(apiMappingKey.orNull)
      .domainName(domainName.orNull)
      .apiId(apiId.orNull)
      .build()
}
