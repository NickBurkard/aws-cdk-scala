package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    restApiId: Option[String] = None,
    schema: Option[AnyRef] = None,
    contentType: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnModelProps =
    (new software.amazon.awscdk.services.apigateway.CfnModelProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .restApiId(restApiId.orNull)
      .schema(schema.orNull)
      .contentType(contentType.orNull)
      .build()
}
