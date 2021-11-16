package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModel {

  def apply(
    internalResourceId: String,
    name: String,
    apiId: String,
    schema: AnyRef,
    description: Option[String] = None,
    contentType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnModel =
    software.amazon.awscdk.services.apigatewayv2.CfnModel.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .apiId(apiId)
      .schema(schema)
      .description(description.orNull)
      .contentType(contentType.orNull)
      .build()
}
