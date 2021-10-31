package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventBridgePutEventsEntry {

  def apply(
    source: Option[String] = None,
    eventBus: Option[software.amazon.awscdk.services.events.IEventBus] = None,
    detailType: Option[String] = None,
    detail: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry.Builder)
      .source(source.orNull)
      .eventBus(eventBus.orNull)
      .detailType(detailType.orNull)
      .detail(detail.orNull)
      .build()
}
