package io.burkard.cdk.services.appintegrations

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventIntegrationProps {

  def apply(
    name: String,
    eventFilter: software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty,
    eventBridgeBus: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps =
    (new software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps.Builder)
      .name(name)
      .eventFilter(eventFilter)
      .eventBridgeBus(eventBridgeBus)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
