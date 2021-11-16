package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RoutingStrategyProperty {

  def apply(
    `type`: String,
    fleetId: Option[String] = None,
    message: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty =
    (new software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder)
      .`type`(`type`)
      .fleetId(fleetId.orNull)
      .message(message.orNull)
      .build()
}
