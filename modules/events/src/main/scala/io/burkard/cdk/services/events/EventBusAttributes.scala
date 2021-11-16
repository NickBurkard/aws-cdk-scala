package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventBusAttributes {

  def apply(
    eventBusPolicy: String,
    eventBusArn: String,
    eventBusName: String,
    eventSourceName: Option[String] = None
  ): software.amazon.awscdk.services.events.EventBusAttributes =
    (new software.amazon.awscdk.services.events.EventBusAttributes.Builder)
      .eventBusPolicy(eventBusPolicy)
      .eventBusArn(eventBusArn)
      .eventBusName(eventBusName)
      .eventSourceName(eventSourceName.orNull)
      .build()
}
