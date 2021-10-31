package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchemaVersion {

  def apply(
    internalResourceId: String,
    schemaDefinition: Option[String] = None,
    schema: Option[software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnSchemaVersion =
    software.amazon.awscdk.services.glue.CfnSchemaVersion.Builder
      .create(stackCtx, internalResourceId)
      .schemaDefinition(schemaDefinition.orNull)
      .schema(schema.orNull)
      .build()
}
