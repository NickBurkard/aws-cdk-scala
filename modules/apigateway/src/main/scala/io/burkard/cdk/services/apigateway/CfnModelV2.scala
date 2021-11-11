package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelV2 {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    description: Option[String] = None,
    apiId: Option[String] = None,
    schema: Option[AnyRef] = None,
    contentType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnModelV2 =
    software.amazon.awscdk.services.apigateway.CfnModelV2.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .description(description.orNull)
      .apiId(apiId.orNull)
      .schema(schema.orNull)
      .contentType(contentType.orNull)
      .build()
}
