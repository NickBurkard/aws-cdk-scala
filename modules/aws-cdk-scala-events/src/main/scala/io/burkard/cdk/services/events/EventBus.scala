package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventBus {

  def apply(
    eventBus: software.amazon.awscdk.services.events.IEventBus,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.events.targets.EventBus =
    software.amazon.awscdk.services.events.targets.EventBus.Builder
      .create(eventBus)
      .role(role.orNull)
      .build()
}
