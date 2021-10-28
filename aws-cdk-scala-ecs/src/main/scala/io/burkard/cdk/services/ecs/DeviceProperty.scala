package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeviceProperty {

  def apply(
    hostPath: Option[String] = None,
    permissions: Option[List[String]] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder)
      .hostPath(hostPath.orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .containerPath(containerPath.orNull)
      .build()
}
