package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEventBusProps {

  def apply(
    name: Option[String] = None,
    eventSourceName: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnEventBusProps =
    (new software.amazon.awscdk.services.events.CfnEventBusProps.Builder)
      .name(name.orNull)
      .eventSourceName(eventSourceName.orNull)
      .build()
}
