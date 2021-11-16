package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchemaVersionProps {

  def apply(
    schemaDefinition: String,
    schema: software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty
  ): software.amazon.awscdk.services.glue.CfnSchemaVersionProps =
    (new software.amazon.awscdk.services.glue.CfnSchemaVersionProps.Builder)
      .schemaDefinition(schemaDefinition)
      .schema(schema)
      .build()
}
