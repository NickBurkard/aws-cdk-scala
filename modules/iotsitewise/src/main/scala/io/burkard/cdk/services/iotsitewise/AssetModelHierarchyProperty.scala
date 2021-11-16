package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetModelHierarchyProperty {

  def apply(
    logicalId: String,
    name: String,
    childAssetModelId: String
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty.Builder)
      .logicalId(logicalId)
      .name(name)
      .childAssetModelId(childAssetModelId)
      .build()
}
