package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiDestinationProps {

  def apply(
    name: Option[String] = None,
    invocationRateLimitPerSecond: Option[Number] = None,
    description: Option[String] = None,
    httpMethod: Option[String] = None,
    connectionArn: Option[String] = None,
    invocationEndpoint: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnApiDestinationProps =
    (new software.amazon.awscdk.services.events.CfnApiDestinationProps.Builder)
      .name(name.orNull)
      .invocationRateLimitPerSecond(invocationRateLimitPerSecond.orNull)
      .description(description.orNull)
      .httpMethod(httpMethod.orNull)
      .connectionArn(connectionArn.orNull)
      .invocationEndpoint(invocationEndpoint.orNull)
      .build()
}
