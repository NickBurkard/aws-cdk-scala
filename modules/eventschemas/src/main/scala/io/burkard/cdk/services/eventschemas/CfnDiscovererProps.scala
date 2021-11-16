package io.burkard.cdk.services.eventschemas

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDiscovererProps {

  def apply(
    sourceArn: String,
    crossAccount: Option[Boolean] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty]] = None
  ): software.amazon.awscdk.services.eventschemas.CfnDiscovererProps =
    (new software.amazon.awscdk.services.eventschemas.CfnDiscovererProps.Builder)
      .sourceArn(sourceArn)
      .crossAccount(crossAccount.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
