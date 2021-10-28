package io.burkard.cdk.services.eventschemas

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRegistry {

  def apply(
    internalResourceId: String,
    registryName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.eventschemas.CfnRegistry.TagsEntryProperty]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eventschemas.CfnRegistry =
    software.amazon.awscdk.services.eventschemas.CfnRegistry.Builder
      .create(stackCtx, internalResourceId)
      .registryName(registryName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
