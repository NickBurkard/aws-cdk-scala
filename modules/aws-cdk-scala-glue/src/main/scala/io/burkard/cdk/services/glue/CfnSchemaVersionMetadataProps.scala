package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
