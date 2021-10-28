package io.burkard.cdk.services.eventschemas

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDiscovererProps {

  def apply(
    sourceArn: Option[String] = None,
    crossAccount: Option[Boolean] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty]] = None
  ): software.amazon.awscdk.services.eventschemas.CfnDiscovererProps =
    (new software.amazon.awscdk.services.eventschemas.CfnDiscovererProps.Builder)
      .sourceArn(sourceArn.orNull)
      .crossAccount(crossAccount.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
