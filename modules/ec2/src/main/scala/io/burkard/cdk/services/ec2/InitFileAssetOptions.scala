package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InitFileAssetOptions {

  def apply(
    assetHash: Option[String] = None,
    serviceRestartHandles: Option[List[_ <: software.amazon.awscdk.services.ec2.InitServiceRestartHandle]] = None,
    bundling: Option[software.amazon.awscdk.BundlingOptions] = None,
    exclude: Option[List[String]] = None,
    owner: Option[String] = None,
    base64Encoded: Option[Boolean] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    group: Option[String] = None,
    assetHashType: Option[software.amazon.awscdk.AssetHashType] = None,
    readers: Option[List[_ <: software.amazon.awscdk.services.iam.IGrantable]] = None,
    mode: Option[String] = None,
    followSymlinks: Option[software.amazon.awscdk.SymlinkFollowMode] = None
  ): software.amazon.awscdk.services.ec2.InitFileAssetOptions =
    (new software.amazon.awscdk.services.ec2.InitFileAssetOptions.Builder)
      .assetHash(assetHash.orNull)
      .serviceRestartHandles(serviceRestartHandles.map(_.asJava).orNull)
      .bundling(bundling.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .owner(owner.orNull)
      .base64Encoded(base64Encoded.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ignoreMode(ignoreMode.orNull)
      .group(group.orNull)
      .assetHashType(assetHashType.orNull)
      .readers(readers.map(_.asJava).orNull)
      .mode(mode.orNull)
      .followSymlinks(followSymlinks.orNull)
      .build()
}
