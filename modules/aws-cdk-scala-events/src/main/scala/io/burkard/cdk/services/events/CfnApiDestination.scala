package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApiDestination {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    invocationRateLimitPerSecond: Option[Number] = None,
    description: Option[String] = None,
    httpMethod: Option[String] = None,
    connectionArn: Option[String] = None,
    invocationEndpoint: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.CfnApiDestination =
    software.amazon.awscdk.services.events.CfnApiDestination.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .invocationRateLimitPerSecond(invocationRateLimitPerSecond.orNull)
      .description(description.orNull)
      .httpMethod(httpMethod.orNull)
      .connectionArn(connectionArn.orNull)
      .invocationEndpoint(invocationEndpoint.orNull)
      .build()
}
