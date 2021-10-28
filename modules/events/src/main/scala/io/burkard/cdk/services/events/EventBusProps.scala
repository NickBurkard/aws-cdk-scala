package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventBusProps {

  def apply(
    eventSourceName: Option[String] = None,
    eventBusName: Option[String] = None
  ): software.amazon.awscdk.services.events.EventBusProps =
    (new software.amazon.awscdk.services.events.EventBusProps.Builder)
      .eventSourceName(eventSourceName.orNull)
      .eventBusName(eventBusName.orNull)
      .build()
}