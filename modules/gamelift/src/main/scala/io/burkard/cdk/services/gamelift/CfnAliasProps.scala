package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAliasProps {

  def apply(
    name: String,
    routingStrategy: software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty,
    description: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnAliasProps =
    (new software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder)
      .name(name)
      .routingStrategy(routingStrategy)
      .description(description.orNull)
      .build()
}
