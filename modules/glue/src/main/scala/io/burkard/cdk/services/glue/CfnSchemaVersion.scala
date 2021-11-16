package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchemaVersion {

  def apply(
    internalResourceId: String,
    schemaDefinition: String,
    schema: software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnSchemaVersion =
    software.amazon.awscdk.services.glue.CfnSchemaVersion.Builder
      .create(stackCtx, internalResourceId)
      .schemaDefinition(schemaDefinition)
      .schema(schema)
      .build()
}
