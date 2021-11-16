package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelProps {

  def apply(
    restApiId: String,
    name: Option[String] = None,
    description: Option[String] = None,
    schema: Option[AnyRef] = None,
    contentType: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnModelProps =
    (new software.amazon.awscdk.services.apigateway.CfnModelProps.Builder)
      .restApiId(restApiId)
      .name(name.orNull)
      .description(description.orNull)
      .schema(schema.orNull)
      .contentType(contentType.orNull)
      .build()
}
