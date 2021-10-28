package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModel {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    description: Option[String] = None,
    apiId: Option[String] = None,
    schema: Option[AnyRef] = None,
    contentType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnModel =
    software.amazon.awscdk.services.apigatewayv2.CfnModel.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .description(description.orNull)
      .apiId(apiId.orNull)
      .schema(schema.orNull)
      .contentType(contentType.orNull)
      .build()
}
