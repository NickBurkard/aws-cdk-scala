package io.burkard.cdk.services.codebuild

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProjectCacheProperty {

  def apply(
    modes: Option[List[String]] = None,
    location: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.Builder)
      .modes(modes.map(_.asJava).orNull)
      .location(location.orNull)
      .`type`(`type`.orNull)
      .build()
}
