package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelV2 {

  def apply(
    internalResourceId: String,
    name: String,
    apiId: String,
    schema: AnyRef,
    description: Option[String] = None,
    contentType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnModelV2 =
    software.amazon.awscdk.services.apigateway.CfnModelV2.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .apiId(apiId)
      .schema(schema)
      .description(description.orNull)
      .contentType(contentType.orNull)
      .build()
}
