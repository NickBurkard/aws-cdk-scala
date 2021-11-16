package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchemaVersionMetadataProps {

  def apply(
    key: String,
    value: String,
    schemaVersionId: String
  ): software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps =
    (new software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps.Builder)
      .key(key)
      .value(value)
      .schemaVersionId(schemaVersionId)
      .build()
}
