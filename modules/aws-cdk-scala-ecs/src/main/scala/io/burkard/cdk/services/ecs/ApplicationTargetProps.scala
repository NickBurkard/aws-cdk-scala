package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationTargetProps {

  def apply(
    priority: Option[Number] = None,
    containerPort: Option[Number] = None,
    listener: Option[String] = None,
    pathPattern: Option[String] = None,
    protocol: Option[software.amazon.awscdk.services.ecs.Protocol] = None,
    hostHeader: Option[String] = None
  ): software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps =
    (new software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps.Builder)
      .priority(priority.orNull)
      .containerPort(containerPort.orNull)
      .listener(listener.orNull)
      .pathPattern(pathPattern.orNull)
      .protocol(protocol.orNull)
      .hostHeader(hostHeader.orNull)
      .build()
}
