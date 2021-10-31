package io.burkard.cdk.services.cloudtrail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventSelectorProperty {

  def apply(
    readWriteType: Option[String] = None,
    dataResources: Option[List[_]] = None,
    excludeManagementEventSources: Option[List[String]] = None,
    includeManagementEvents: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty =
    (new software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder)
      .readWriteType(readWriteType.orNull)
      .dataResources(dataResources.map(_.asJava).orNull)
      .excludeManagementEventSources(excludeManagementEventSources.map(_.asJava).orNull)
      .includeManagementEvents(includeManagementEvents.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
