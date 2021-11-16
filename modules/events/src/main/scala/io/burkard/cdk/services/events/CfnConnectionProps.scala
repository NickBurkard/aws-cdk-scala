package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnectionProps {

  def apply(
    authParameters: AnyRef,
    authorizationType: String,
    name: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnConnectionProps =
    (new software.amazon.awscdk.services.events.CfnConnectionProps.Builder)
      .authParameters(authParameters)
      .authorizationType(authorizationType)
      .name(name.orNull)
      .description(description.orNull)
      .build()
}
