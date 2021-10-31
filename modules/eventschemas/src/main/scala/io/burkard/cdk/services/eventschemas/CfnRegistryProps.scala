package io.burkard.cdk.services.eventschemas

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRegistryProps {

  def apply(
    registryName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.eventschemas.CfnRegistry.TagsEntryProperty]] = None
  ): software.amazon.awscdk.services.eventschemas.CfnRegistryProps =
    (new software.amazon.awscdk.services.eventschemas.CfnRegistryProps.Builder)
      .registryName(registryName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
