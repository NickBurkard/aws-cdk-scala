package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RoutingStrategyProperty {

  def apply(
    fleetId: Option[String] = None,
    message: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty =
    (new software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder)
      .fleetId(fleetId.orNull)
      .message(message.orNull)
      .`type`(`type`.orNull)
      .build()
}
