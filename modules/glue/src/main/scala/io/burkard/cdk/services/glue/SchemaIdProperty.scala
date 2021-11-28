package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SchemaIdProperty {

  def apply(
    schemaArn: Option[String] = None,
    schemaName: Option[String] = None,
    registryName: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty =
    (new software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty.Builder)
      .schemaArn(schemaArn.orNull)
      .schemaName(schemaName.orNull)
      .registryName(registryName.orNull)
      .build()
}
