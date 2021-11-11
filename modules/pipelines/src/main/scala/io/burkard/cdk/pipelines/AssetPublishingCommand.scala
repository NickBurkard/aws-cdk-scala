package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
