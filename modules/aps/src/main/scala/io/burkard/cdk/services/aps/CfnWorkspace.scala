package io.burkard.cdk.services.aps

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
