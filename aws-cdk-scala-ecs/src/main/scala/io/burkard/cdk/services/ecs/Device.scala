package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Device {

  def apply(
    hostPath: Option[String] = None,
    permissions: Option[List[_ <: software.amazon.awscdk.services.ecs.DevicePermission]] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.ecs.Device =
    (new software.amazon.awscdk.services.ecs.Device.Builder)
      .hostPath(hostPath.orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .containerPath(containerPath.orNull)
      .build()
}
