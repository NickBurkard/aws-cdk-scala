package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StackAsset {

  def apply(
    assetManifestPath: String,
    assetType: software.amazon.awscdk.pipelines.AssetType,
    assetId: String,
    assetSelector: String,
    isTemplate: Boolean,
    assetPublishingRoleArn: Option[String] = None
  ): software.amazon.awscdk.pipelines.StackAsset =
    (new software.amazon.awscdk.pipelines.StackAsset.Builder)
      .assetManifestPath(assetManifestPath)
      .assetType(assetType)
      .assetId(assetId)
      .assetSelector(assetSelector)
      .isTemplate(isTemplate)
      .assetPublishingRoleArn(assetPublishingRoleArn.orNull)
      .build()
}
