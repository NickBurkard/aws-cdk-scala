package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssetPropertyProperty {

  def apply(
    alias: Option[String] = None,
    notificationState: Option[String] = None,
    logicalId: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty.Builder)
      .alias(alias.orNull)
      .notificationState(notificationState.orNull)
      .logicalId(logicalId.orNull)
      .build()
}
