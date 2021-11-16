package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GamePropertyProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty =
    (new software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
