package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiDestinationProps {

  def apply(
    httpMethod: String,
    connectionArn: String,
    invocationEndpoint: String,
    name: Option[String] = None,
    invocationRateLimitPerSecond: Option[Number] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnApiDestinationProps =
    (new software.amazon.awscdk.services.events.CfnApiDestinationProps.Builder)
      .httpMethod(httpMethod)
      .connectionArn(connectionArn)
      .invocationEndpoint(invocationEndpoint)
      .name(name.orNull)
      .invocationRateLimitPerSecond(invocationRateLimitPerSecond.orNull)
      .description(description.orNull)
      .build()
}
