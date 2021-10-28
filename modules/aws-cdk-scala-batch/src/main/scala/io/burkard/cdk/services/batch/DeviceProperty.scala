package io.burkard.cdk.services.batch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeviceProperty {

  def apply(
    hostPath: Option[String] = None,
    permissions: Option[List[String]] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty.Builder)
      .hostPath(hostPath.orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .containerPath(containerPath.orNull)
      .build()
}
