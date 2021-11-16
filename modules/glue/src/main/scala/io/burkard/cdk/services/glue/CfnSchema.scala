package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchema {

  def apply(
    internalResourceId: String,
    name: String,
    schemaDefinition: String,
    compatibility: String,
    dataFormat: String,
    registry: Option[software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty] = None,
    description: Option[String] = None,
    checkpointVersion: Option[software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnSchema =
    software.amazon.awscdk.services.glue.CfnSchema.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .schemaDefinition(schemaDefinition)
      .compatibility(compatibility)
      .dataFormat(dataFormat)
      .registry(registry.orNull)
      .description(description.orNull)
      .checkpointVersion(checkpointVersion.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
