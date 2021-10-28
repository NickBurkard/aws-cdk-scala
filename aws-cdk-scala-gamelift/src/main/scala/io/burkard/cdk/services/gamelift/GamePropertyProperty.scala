package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GamePropertyProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty =
    (new software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
