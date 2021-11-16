package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiDestination {

  def apply(
    internalResourceId: String,
    httpMethod: String,
    connectionArn: String,
    invocationEndpoint: String,
    name: Option[String] = None,
    invocationRateLimitPerSecond: Option[Number] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.CfnApiDestination =
    software.amazon.awscdk.services.events.CfnApiDestination.Builder
      .create(stackCtx, internalResourceId)
      .httpMethod(httpMethod)
      .connectionArn(connectionArn)
      .invocationEndpoint(invocationEndpoint)
      .name(name.orNull)
      .invocationRateLimitPerSecond(invocationRateLimitPerSecond.orNull)
      .description(description.orNull)
      .build()
}
