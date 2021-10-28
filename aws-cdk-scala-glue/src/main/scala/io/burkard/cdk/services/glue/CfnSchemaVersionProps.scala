package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSchemaVersionProps {

  def apply(
    schemaDefinition: Option[String] = None,
    schema: Option[software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty] = None
  ): software.amazon.awscdk.services.glue.CfnSchemaVersionProps =
    (new software.amazon.awscdk.services.glue.CfnSchemaVersionProps.Builder)
      .schemaDefinition(schemaDefinition.orNull)
      .schema(schema.orNull)
      .build()
}
