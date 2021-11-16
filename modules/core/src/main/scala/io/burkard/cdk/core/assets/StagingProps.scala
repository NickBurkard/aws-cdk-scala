package io.burkard.cdk.core.assets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StagingProps {

  def apply(
    sourcePath: String,
    extraHash: Option[String] = None,
    exclude: Option[List[String]] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    follow: Option[software.amazon.awscdk.assets.FollowMode] = None
  ): software.amazon.awscdk.assets.StagingProps =
    (new software.amazon.awscdk.assets.StagingProps.Builder)
      .sourcePath(sourcePath)
      .extraHash(extraHash.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .ignoreMode(ignoreMode.orNull)
      .follow(follow.orNull)
      .build()
}
