package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAlias {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    routingStrategy: Option[software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.gamelift.CfnAlias =
    software.amazon.awscdk.services.gamelift.CfnAlias.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .routingStrategy(routingStrategy.orNull)
      .description(description.orNull)
      .build()
}
