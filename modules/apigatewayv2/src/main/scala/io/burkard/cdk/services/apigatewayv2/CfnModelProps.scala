package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    apiId: Option[String] = None,
    schema: Option[AnyRef] = None,
    contentType: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnModelProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnModelProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .apiId(apiId.orNull)
      .schema(schema.orNull)
      .contentType(contentType.orNull)
      .build()
}
