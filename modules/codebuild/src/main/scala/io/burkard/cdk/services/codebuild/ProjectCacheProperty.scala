package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProjectCacheProperty {

  def apply(
    `type`: String,
    modes: Option[List[String]] = None,
    location: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.Builder)
      .`type`(`type`)
      .modes(modes.map(_.asJava).orNull)
      .location(location.orNull)
      .build()
}
