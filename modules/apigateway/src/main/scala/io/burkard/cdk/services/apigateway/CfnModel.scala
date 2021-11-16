package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModel {

  def apply(
    internalResourceId: String,
    restApiId: String,
    name: Option[String] = None,
    description: Option[String] = None,
    schema: Option[AnyRef] = None,
    contentType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnModel =
    software.amazon.awscdk.services.apigateway.CfnModel.Builder
      .create(stackCtx, internalResourceId)
      .restApiId(restApiId)
      .name(name.orNull)
      .description(description.orNull)
      .schema(schema.orNull)
      .contentType(contentType.orNull)
      .build()
}
