package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConnectionProps {

  def apply(
    name: Option[String] = None,
    authParameters: Option[AnyRef] = None,
    description: Option[String] = None,
    authorizationType: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnConnectionProps =
    (new software.amazon.awscdk.services.events.CfnConnectionProps.Builder)
      .name(name.orNull)
      .authParameters(authParameters.orNull)
      .description(description.orNull)
      .authorizationType(authorizationType.orNull)
      .build()
}
