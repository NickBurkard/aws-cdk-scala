package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EcsTarget {

  def apply(
    containerName: Option[String] = None,
    listener: Option[software.amazon.awscdk.services.ecs.ListenerConfig] = None,
    protocol: Option[software.amazon.awscdk.services.ecs.Protocol] = None,
    newTargetGroupId: Option[String] = None,
    containerPort: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.EcsTarget =
    (new software.amazon.awscdk.services.ecs.EcsTarget.Builder)
      .containerName(containerName.orNull)
      .listener(listener.orNull)
      .protocol(protocol.orNull)
      .newTargetGroupId(newTargetGroupId.orNull)
      .containerPort(containerPort.orNull)
      .build()
}
