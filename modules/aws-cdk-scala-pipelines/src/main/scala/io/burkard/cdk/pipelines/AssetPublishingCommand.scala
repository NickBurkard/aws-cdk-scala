package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssetPublishingCommand {

  def apply(
    assetManifestPath: Option[String] = None,
    assetType: Option[software.amazon.awscdk.pipelines.AssetType] = None,
    assetId: Option[String] = None,
    assetSelector: Option[String] = None,
    assetPublishingRoleArn: Option[String] = None
  ): software.amazon.awscdk.pipelines.AssetPublishingCommand =
    (new software.amazon.awscdk.pipelines.AssetPublishingCommand.Builder)
      .assetManifestPath(assetManifestPath.orNull)
      .assetType(assetType.orNull)
      .assetId(assetId.orNull)
      .assetSelector(assetSelector.orNull)
      .assetPublishingRoleArn(assetPublishingRoleArn.orNull)
      .build()
}
