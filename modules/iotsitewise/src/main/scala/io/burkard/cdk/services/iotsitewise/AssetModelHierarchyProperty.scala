package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetModelHierarchyProperty {

  def apply(
    logicalId: Option[String] = None,
    name: Option[String] = None,
    childAssetModelId: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty.Builder)
      .logicalId(logicalId.orNull)
      .name(name.orNull)
      .childAssetModelId(childAssetModelId.orNull)
      .build()
}
