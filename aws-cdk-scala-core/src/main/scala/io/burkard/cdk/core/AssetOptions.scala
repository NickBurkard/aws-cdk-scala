package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssetOptions {

  def apply(
    assetHashType: Option[software.amazon.awscdk.AssetHashType] = None,
    assetHash: Option[String] = None,
    bundling: Option[software.amazon.awscdk.BundlingOptions] = None
  ): software.amazon.awscdk.AssetOptions =
    (new software.amazon.awscdk.AssetOptions.Builder)
      .assetHashType(assetHashType.orNull)
      .assetHash(assetHash.orNull)
      .bundling(bundling.orNull)
      .build()
}
