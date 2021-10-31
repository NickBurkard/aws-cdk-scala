package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelProps {

  def apply(
    description: Option[String] = None,
    restApi: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None,
    modelName: Option[String] = None,
    schema: Option[software.amazon.awscdk.services.apigateway.JsonSchema] = None,
    contentType: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.ModelProps =
    (new software.amazon.awscdk.services.apigateway.ModelProps.Builder)
      .description(description.orNull)
      .restApi(restApi.orNull)
      .modelName(modelName.orNull)
      .schema(schema.orNull)
      .contentType(contentType.orNull)
      .build()
}
