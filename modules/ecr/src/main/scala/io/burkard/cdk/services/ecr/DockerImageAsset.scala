package io.burkard.cdk.services.ecr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DockerImageAsset {

  def apply(
    internalResourceId: String,
    invalidation: Option[software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions] = None,
    extraHash: Option[String] = None,
    followSymlinks: Option[software.amazon.awscdk.SymlinkFollowMode] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    repositoryName: Option[String] = None,
    buildArgs: Option[Map[String, String]] = None,
    file: Option[String] = None,
    target: Option[String] = None,
    exclude: Option[List[String]] = None,
    follow: Option[software.amazon.awscdk.assets.FollowMode] = None,
    directory: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecr.assets.DockerImageAsset =
    software.amazon.awscdk.services.ecr.assets.DockerImageAsset.Builder
      .create(stackCtx, internalResourceId)
      .invalidation(invalidation.orNull)
      .extraHash(extraHash.orNull)
      .followSymlinks(followSymlinks.orNull)
      .ignoreMode(ignoreMode.orNull)
      .repositoryName(repositoryName.orNull)
      .buildArgs(buildArgs.map(_.asJava).orNull)
      .file(file.orNull)
      .target(target.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .follow(follow.orNull)
      .directory(directory.orNull)
      .build()
}
