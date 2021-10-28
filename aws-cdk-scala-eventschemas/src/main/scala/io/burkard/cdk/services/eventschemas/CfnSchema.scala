package io.burkard.cdk.services.eventschemas

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSchema {

  def apply(
    internalResourceId: String,
    schemaName: Option[String] = None,
    content: Option[String] = None,
    registryName: Option[String] = None,
    `type`: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eventschemas.CfnSchema =
    software.amazon.awscdk.services.eventschemas.CfnSchema.Builder
      .create(stackCtx, internalResourceId)
      .schemaName(schemaName.orNull)
      .content(content.orNull)
      .registryName(registryName.orNull)
      .`type`(`type`.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
