package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetStagingProps {

  def apply(
    assetHashType: Option[software.amazon.awscdk.AssetHashType] = None,
    assetHash: Option[String] = None,
    extraHash: Option[String] = None,
    exclude: Option[List[String]] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    follow: Option[software.amazon.awscdk.SymlinkFollowMode] = None,
    bundling: Option[software.amazon.awscdk.BundlingOptions] = None,
    sourcePath: Option[String] = None
  ): software.amazon.awscdk.AssetStagingProps =
    (new software.amazon.awscdk.AssetStagingProps.Builder)
      .assetHashType(assetHashType.orNull)
      .assetHash(assetHash.orNull)
      .extraHash(extraHash.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .ignoreMode(ignoreMode.orNull)
      .follow(follow.orNull)
      .bundling(bundling.orNull)
      .sourcePath(sourcePath.orNull)
      .build()
}
