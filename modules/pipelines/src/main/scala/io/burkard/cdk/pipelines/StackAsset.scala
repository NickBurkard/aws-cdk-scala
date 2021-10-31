package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StackAsset {

  def apply(
    assetManifestPath: Option[String] = None,
    assetType: Option[software.amazon.awscdk.pipelines.AssetType] = None,
    assetId: Option[String] = None,
    assetSelector: Option[String] = None,
    isTemplate: Option[Boolean] = None,
    assetPublishingRoleArn: Option[String] = None
  ): software.amazon.awscdk.pipelines.StackAsset =
    (new software.amazon.awscdk.pipelines.StackAsset.Builder)
      .assetManifestPath(assetManifestPath.orNull)
      .assetType(assetType.orNull)
      .assetId(assetId.orNull)
      .assetSelector(assetSelector.orNull)
      .isTemplate(isTemplate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .assetPublishingRoleArn(assetPublishingRoleArn.orNull)
      .build()
}
