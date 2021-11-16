package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsTarget {

  def apply(
    containerName: String,
    listener: software.amazon.awscdk.services.ecs.ListenerConfig,
    newTargetGroupId: String,
    protocol: Option[software.amazon.awscdk.services.ecs.Protocol] = None,
    containerPort: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.EcsTarget =
    (new software.amazon.awscdk.services.ecs.EcsTarget.Builder)
      .containerName(containerName)
      .listener(listener)
      .newTargetGroupId(newTargetGroupId)
      .protocol(protocol.orNull)
      .containerPort(containerPort.orNull)
      .build()
}
