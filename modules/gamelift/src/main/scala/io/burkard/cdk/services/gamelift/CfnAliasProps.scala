package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAliasProps {

  def apply(
    name: Option[String] = None,
    routingStrategy: Option[software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnAliasProps =
    (new software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder)
      .name(name.orNull)
      .routingStrategy(routingStrategy.orNull)
      .description(description.orNull)
      .build()
}
