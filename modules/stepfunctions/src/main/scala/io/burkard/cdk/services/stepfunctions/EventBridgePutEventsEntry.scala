package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventBridgePutEventsEntry {

  def apply(
    source: String,
    detailType: String,
    detail: software.amazon.awscdk.services.stepfunctions.TaskInput,
    eventBus: Option[software.amazon.awscdk.services.events.IEventBus] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry.Builder)
      .source(source)
      .detailType(detailType)
      .detail(detail)
      .eventBus(eventBus.orNull)
      .build()
}
