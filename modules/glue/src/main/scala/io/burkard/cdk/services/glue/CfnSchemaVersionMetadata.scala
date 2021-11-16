package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchemaVersionMetadata {

  def apply(
    internalResourceId: String,
    key: String,
    value: String,
    schemaVersionId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata =
    software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata.Builder
      .create(stackCtx, internalResourceId)
      .key(key)
      .value(value)
      .schemaVersionId(schemaVersionId)
      .build()
}
