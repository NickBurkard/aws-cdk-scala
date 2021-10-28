package io.burkard.cdk.services.cloudtrail

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
