package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProjectTriggersProperty {

  def apply(
    filterGroups: Option[List[_]] = None,
    buildType: Option[String] = None,
    webhook: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.Builder)
      .filterGroups(filterGroups.map(_.asJava).orNull)
      .buildType(buildType.orNull)
      .webhook(webhook.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
