package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Model {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    restApi: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None,
    modelName: Option[String] = None,
    schema: Option[software.amazon.awscdk.services.apigateway.JsonSchema] = None,
    contentType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.Model =
    software.amazon.awscdk.services.apigateway.Model.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .restApi(restApi.orNull)
      .modelName(modelName.orNull)
      .schema(schema.orNull)
      .contentType(contentType.orNull)
      .build()
}
