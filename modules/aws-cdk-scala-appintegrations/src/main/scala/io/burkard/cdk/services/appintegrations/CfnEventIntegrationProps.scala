package io.burkard.cdk.services.appintegrations

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEventIntegrationProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    eventFilter: Option[software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty] = None,
    eventBridgeBus: Option[String] = None
  ): software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps =
    (new software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .eventFilter(eventFilter.orNull)
      .eventBridgeBus(eventBridgeBus.orNull)
      .build()
}
