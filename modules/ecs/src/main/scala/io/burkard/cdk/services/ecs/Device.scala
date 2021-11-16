package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Device {

  def apply(
    hostPath: String,
    permissions: Option[List[_ <: software.amazon.awscdk.services.ecs.DevicePermission]] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.ecs.Device =
    (new software.amazon.awscdk.services.ecs.Device.Builder)
      .hostPath(hostPath)
      .permissions(permissions.map(_.asJava).orNull)
      .containerPath(containerPath.orNull)
      .build()
}
