package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventBusAttributes {

  def apply(
    eventSourceName: Option[String] = None,
    eventBusPolicy: Option[String] = None,
    eventBusArn: Option[String] = None,
    eventBusName: Option[String] = None
  ): software.amazon.awscdk.services.events.EventBusAttributes =
    (new software.amazon.awscdk.services.events.EventBusAttributes.Builder)
      .eventSourceName(eventSourceName.orNull)
      .eventBusPolicy(eventBusPolicy.orNull)
      .eventBusArn(eventBusArn.orNull)
      .eventBusName(eventBusName.orNull)
      .build()
}
