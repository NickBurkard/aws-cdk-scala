package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelProps {

  def apply(
    name: String,
    apiId: String,
    schema: AnyRef,
    description: Option[String] = None,
    contentType: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnModelProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnModelProps.Builder)
      .name(name)
      .apiId(apiId)
      .schema(schema)
      .description(description.orNull)
      .contentType(contentType.orNull)
      .build()
}
