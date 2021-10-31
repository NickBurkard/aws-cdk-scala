package io.burkard.cdk.services.codecommit

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RepositoryTriggerOptions {

  def apply(
    name: Option[String] = None,
    customData: Option[String] = None,
    branches: Option[List[String]] = None,
    events: Option[List[_ <: software.amazon.awscdk.services.codecommit.RepositoryEventTrigger]] = None
  ): software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions =
    (new software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.Builder)
      .name(name.orNull)
      .customData(customData.orNull)
      .branches(branches.map(_.asJava).orNull)
      .events(events.map(_.asJava).orNull)
      .build()
}
