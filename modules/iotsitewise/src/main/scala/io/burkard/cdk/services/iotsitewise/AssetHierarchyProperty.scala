package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
