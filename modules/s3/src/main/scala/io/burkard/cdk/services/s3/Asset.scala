package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Asset {

  def apply(
    internalResourceId: String,
    path: Option[String] = None,
    assetHash: Option[String] = None,
    bundling: Option[software.amazon.awscdk.BundlingOptions] = None,
    followSymlinks: Option[software.amazon.awscdk.SymlinkFollowMode] = None,
    exclude: Option[List[String]] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    assetHashType: Option[software.amazon.awscdk.AssetHashType] = None,
    readers: Option[List[_ <: software.amazon.awscdk.services.iam.IGrantable]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.assets.Asset =
    software.amazon.awscdk.services.s3.assets.Asset.Builder
      .create(stackCtx, internalResourceId)
      .path(path.orNull)
      .assetHash(assetHash.orNull)
      .bundling(bundling.orNull)
      .followSymlinks(followSymlinks.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .ignoreMode(ignoreMode.orNull)
      .assetHashType(assetHashType.orNull)
      .readers(readers.map(_.asJava).orNull)
      .build()
}
