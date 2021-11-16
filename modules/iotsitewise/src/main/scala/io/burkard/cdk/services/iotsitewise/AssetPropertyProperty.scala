package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetPropertyProperty {

  def apply(
    logicalId: String,
    alias: Option[String] = None,
    notificationState: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty.Builder)
      .logicalId(logicalId)
      .alias(alias.orNull)
      .notificationState(notificationState.orNull)
      .build()
}
