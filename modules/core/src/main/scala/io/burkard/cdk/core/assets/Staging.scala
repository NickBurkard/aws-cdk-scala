package io.burkard.cdk.core.assets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Staging {

  def apply(
    internalResourceId: String,
    sourcePath: String,
    extraHash: Option[String] = None,
    exclude: Option[List[String]] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    follow: Option[software.amazon.awscdk.assets.FollowMode] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.assets.Staging =
    software.amazon.awscdk.assets.Staging.Builder
      .create(stackCtx, internalResourceId)
      .sourcePath(sourcePath)
      .extraHash(extraHash.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .ignoreMode(ignoreMode.orNull)
      .follow(follow.orNull)
      .build()
}
