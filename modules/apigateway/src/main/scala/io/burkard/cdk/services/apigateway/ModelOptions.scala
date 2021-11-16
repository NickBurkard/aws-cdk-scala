package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelOptions {

  def apply(
    schema: software.amazon.awscdk.services.apigateway.JsonSchema,
    description: Option[String] = None,
    modelName: Option[String] = None,
    contentType: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.ModelOptions =
    (new software.amazon.awscdk.services.apigateway.ModelOptions.Builder)
      .schema(schema)
      .description(description.orNull)
      .modelName(modelName.orNull)
      .contentType(contentType.orNull)
      .build()
}
