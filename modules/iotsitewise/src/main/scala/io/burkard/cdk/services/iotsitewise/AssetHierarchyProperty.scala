package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssetHierarchyProperty {

  def apply(
    childAssetId: Option[String] = None,
    logicalId: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty.Builder)
      .childAssetId(childAssetId.orNull)
      .logicalId(logicalId.orNull)
      .build()
}
