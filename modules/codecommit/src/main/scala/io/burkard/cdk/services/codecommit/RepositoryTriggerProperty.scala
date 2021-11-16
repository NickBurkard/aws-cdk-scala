package io.burkard.cdk.services.codecommit

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepositoryTriggerProperty {

  def apply(
    name: String,
    destinationArn: String,
    events: List[String],
    customData: Option[String] = None,
    branches: Option[List[String]] = None
  ): software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty =
    (new software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder)
      .name(name)
      .destinationArn(destinationArn)
      .events(events.asJava)
      .customData(customData.orNull)
      .branches(branches.map(_.asJava).orNull)
      .build()
}
