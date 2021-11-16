package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Model {

  def apply(
    internalResourceId: String,
    restApi: software.amazon.awscdk.services.apigateway.IRestApi,
    description: Option[String] = None,
    modelName: Option[String] = None,
    schema: Option[software.amazon.awscdk.services.apigateway.JsonSchema] = None,
    contentType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.Model =
    software.amazon.awscdk.services.apigateway.Model.Builder
      .create(stackCtx, internalResourceId)
      .restApi(restApi)
      .description(description.orNull)
      .modelName(modelName.orNull)
      .schema(schema.orNull)
      .contentType(contentType.orNull)
      .build()
}
