package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Tag {

  def apply(
    key: String,
    value: String,
    priority: Option[Number] = None,
    excludeResourceTypes: Option[List[String]] = None,
    applyToLaunchedInstances: Option[Boolean] = None,
    includeResourceTypes: Option[List[String]] = None
  ): software.amazon.awscdk.Tag =
    software.amazon.awscdk.Tag.Builder
      .create(key, value)
      .priority(priority.orNull)
      .excludeResourceTypes(excludeResourceTypes.map(_.asJava).orNull)
      .applyToLaunchedInstances(applyToLaunchedInstances.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeResourceTypes(includeResourceTypes.map(_.asJava).orNull)
      .build()
}
