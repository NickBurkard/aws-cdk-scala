package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetImageCodeProps {

  def apply(
    invalidation: Option[software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions] = None,
    cmd: Option[List[String]] = None,
    entrypoint: Option[List[String]] = None,
    followSymlinks: Option[software.amazon.awscdk.SymlinkFollowMode] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    follow: Option[software.amazon.awscdk.assets.FollowMode] = None,
    repositoryName: Option[String] = None,
    buildArgs: Option[Map[String, String]] = None,
    extraHash: Option[String] = None,
    workingDirectory: Option[String] = None,
    file: Option[String] = None,
    target: Option[String] = None,
    exclude: Option[List[String]] = None
  ): software.amazon.awscdk.services.lambda.AssetImageCodeProps =
    (new software.amazon.awscdk.services.lambda.AssetImageCodeProps.Builder)
      .invalidation(invalidation.orNull)
      .cmd(cmd.map(_.asJava).orNull)
      .entrypoint(entrypoint.map(_.asJava).orNull)
      .followSymlinks(followSymlinks.orNull)
      .ignoreMode(ignoreMode.orNull)
      .follow(follow.orNull)
      .repositoryName(repositoryName.orNull)
      .buildArgs(buildArgs.map(_.asJava).orNull)
      .extraHash(extraHash.orNull)
      .workingDirectory(workingDirectory.orNull)
      .file(file.orNull)
      .target(target.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .build()
}
