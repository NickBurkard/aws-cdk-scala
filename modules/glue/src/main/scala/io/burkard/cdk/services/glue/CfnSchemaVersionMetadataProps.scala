package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchemaVersionMetadataProps {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None,
    schemaVersionId: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps =
    (new software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .schemaVersionId(schemaVersionId.orNull)
      .build()
}
