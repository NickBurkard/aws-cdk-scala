package io.burkard.cdk.services.codecommit

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepositoryTriggerProperty {

  def apply(
    name: Option[String] = None,
    customData: Option[String] = None,
    destinationArn: Option[String] = None,
    branches: Option[List[String]] = None,
    events: Option[List[String]] = None
  ): software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty =
    (new software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder)
      .name(name.orNull)
      .customData(customData.orNull)
      .destinationArn(destinationArn.orNull)
      .branches(branches.map(_.asJava).orNull)
      .events(events.map(_.asJava).orNull)
      .build()
}
