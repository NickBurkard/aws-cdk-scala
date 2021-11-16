package io.burkard.cdk.services.appintegrations

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventIntegration {

  def apply(
    internalResourceId: String,
    name: String,
    eventFilter: software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty,
    eventBridgeBus: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appintegrations.CfnEventIntegration =
    software.amazon.awscdk.services.appintegrations.CfnEventIntegration.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .eventFilter(eventFilter)
      .eventBridgeBus(eventBridgeBus)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
