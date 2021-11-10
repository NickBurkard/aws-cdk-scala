package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventBus {

  def apply(
    internalResourceId: String,
    eventSourceName: Option[String] = None,
    eventBusName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.EventBus =
    software.amazon.awscdk.services.events.EventBus.Builder
      .create(stackCtx, internalResourceId)
      .eventSourceName(eventSourceName.orNull)
      .eventBusName(eventBusName.orNull)
      .build()
}
