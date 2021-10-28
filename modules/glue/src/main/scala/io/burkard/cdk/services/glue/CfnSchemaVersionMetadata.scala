package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSchemaVersionMetadata {

  def apply(
    internalResourceId: String,
    key: Option[String] = None,
    value: Option[String] = None,
    schemaVersionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata =
    software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata.Builder
      .create(stackCtx, internalResourceId)
      .key(key.orNull)
      .value(value.orNull)
      .schemaVersionId(schemaVersionId.orNull)
      .build()
}
