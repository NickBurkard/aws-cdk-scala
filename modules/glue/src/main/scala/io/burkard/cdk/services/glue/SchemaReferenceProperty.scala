package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SchemaReferenceProperty {

  def apply(
    schemaId: Option[software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty] = None,
    schemaVersionNumber: Option[Number] = None,
    schemaVersionId: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty =
    (new software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty.Builder)
      .schemaId(schemaId.orNull)
      .schemaVersionNumber(schemaVersionNumber.orNull)
      .schemaVersionId(schemaVersionId.orNull)
      .build()
}
