package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SchemaProperty {

  def apply(
    schemaArn: Option[String] = None,
    schemaName: Option[String] = None,
    registryName: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty =
    (new software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty.Builder)
      .schemaArn(schemaArn.orNull)
      .schemaName(schemaName.orNull)
      .registryName(registryName.orNull)
      .build()
}
