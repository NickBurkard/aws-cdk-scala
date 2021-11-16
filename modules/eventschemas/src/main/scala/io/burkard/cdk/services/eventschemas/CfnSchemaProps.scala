package io.burkard.cdk.services.eventschemas

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchemaProps {

  def apply(
    content: String,
    registryName: String,
    `type`: String,
    schemaName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty]] = None
  ): software.amazon.awscdk.services.eventschemas.CfnSchemaProps =
    (new software.amazon.awscdk.services.eventschemas.CfnSchemaProps.Builder)
      .content(content)
      .registryName(registryName)
      .`type`(`type`)
      .schemaName(schemaName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
