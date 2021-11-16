package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetHierarchyProperty {

  def apply(
    childAssetId: String,
    logicalId: String
  ): software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty.Builder)
      .childAssetId(childAssetId)
      .logicalId(logicalId)
      .build()
}
