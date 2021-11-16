package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetPublishingCommand {

  def apply(
    assetManifestPath: String,
    assetType: software.amazon.awscdk.pipelines.AssetType,
    assetId: String,
    assetSelector: String,
    assetPublishingRoleArn: String
  ): software.amazon.awscdk.pipelines.AssetPublishingCommand =
    (new software.amazon.awscdk.pipelines.AssetPublishingCommand.Builder)
      .assetManifestPath(assetManifestPath)
      .assetType(assetType)
      .assetId(assetId)
      .assetSelector(assetSelector)
      .assetPublishingRoleArn(assetPublishingRoleArn)
      .build()
}
