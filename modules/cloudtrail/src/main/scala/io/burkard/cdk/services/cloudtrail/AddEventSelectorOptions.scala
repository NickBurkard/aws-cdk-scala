package io.burkard.cdk.services.cloudtrail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddEventSelectorOptions {

  def apply(
    readWriteType: Option[software.amazon.awscdk.services.cloudtrail.ReadWriteType] = None,
    excludeManagementEventSources: Option[List[_ <: software.amazon.awscdk.services.cloudtrail.ManagementEventSources]] = None,
    includeManagementEvents: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions =
    (new software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions.Builder)
      .readWriteType(readWriteType.orNull)
      .excludeManagementEventSources(excludeManagementEventSources.map(_.asJava).orNull)
      .includeManagementEvents(includeManagementEvents.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
