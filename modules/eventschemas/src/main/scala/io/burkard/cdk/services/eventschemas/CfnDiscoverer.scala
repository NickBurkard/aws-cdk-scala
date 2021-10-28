package io.burkard.cdk.services.eventschemas

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDiscoverer {

  def apply(
    internalResourceId: String,
    sourceArn: Option[String] = None,
    crossAccount: Option[Boolean] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eventschemas.CfnDiscoverer =
    software.amazon.awscdk.services.eventschemas.CfnDiscoverer.Builder
      .create(stackCtx, internalResourceId)
      .sourceArn(sourceArn.orNull)
      .crossAccount(crossAccount.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
