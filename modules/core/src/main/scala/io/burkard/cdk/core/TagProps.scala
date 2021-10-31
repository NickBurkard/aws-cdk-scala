package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagProps {

  def apply(
    priority: Option[Number] = None,
    excludeResourceTypes: Option[List[String]] = None,
    applyToLaunchedInstances: Option[Boolean] = None,
    includeResourceTypes: Option[List[String]] = None
  ): software.amazon.awscdk.TagProps =
    (new software.amazon.awscdk.TagProps.Builder)
      .priority(priority.orNull)
      .excludeResourceTypes(excludeResourceTypes.map(_.asJava).orNull)
      .applyToLaunchedInstances(applyToLaunchedInstances.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeResourceTypes(includeResourceTypes.map(_.asJava).orNull)
      .build()
}
