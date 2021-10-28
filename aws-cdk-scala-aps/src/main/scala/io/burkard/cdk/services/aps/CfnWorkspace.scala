package io.burkard.cdk.services.aps

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWorkspace {

  def apply(
    internalResourceId: String,
    alertManagerDefinition: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    alias: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.aps.CfnWorkspace =
    software.amazon.awscdk.services.aps.CfnWorkspace.Builder
      .create(stackCtx, internalResourceId)
      .alertManagerDefinition(alertManagerDefinition.orNull)
      .tags(tags.map(_.asJava).orNull)
      .alias(alias.orNull)
      .build()
}
