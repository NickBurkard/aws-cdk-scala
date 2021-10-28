package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSchemaProps {

  def apply(
    registry: Option[software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty] = None,
    name: Option[String] = None,
    schemaDefinition: Option[String] = None,
    compatibility: Option[String] = None,
    dataFormat: Option[String] = None,
    description: Option[String] = None,
    checkpointVersion: Option[software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.glue.CfnSchemaProps =
    (new software.amazon.awscdk.services.glue.CfnSchemaProps.Builder)
      .registry(registry.orNull)
      .name(name.orNull)
      .schemaDefinition(schemaDefinition.orNull)
      .compatibility(compatibility.orNull)
      .dataFormat(dataFormat.orNull)
      .description(description.orNull)
      .checkpointVersion(checkpointVersion.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
