package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventBus {

  def apply(
    internalResourceId: String,
    name: String,
    eventSourceName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.CfnEventBus =
    software.amazon.awscdk.services.events.CfnEventBus.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .eventSourceName(eventSourceName.orNull)
      .build()
}
