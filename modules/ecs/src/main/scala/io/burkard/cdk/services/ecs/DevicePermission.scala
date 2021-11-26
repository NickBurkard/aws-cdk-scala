package io.burkard.cdk.services.ecs

sealed abstract class DevicePermission(val underlying: software.amazon.awscdk.services.ecs.DevicePermission)
  extends Product
    with Serializable

object DevicePermission {
  implicit def toAws(value: DevicePermission): software.amazon.awscdk.services.ecs.DevicePermission =
    Option(value).map(_.underlying).orNull

  case object Mknod
    extends DevicePermission(software.amazon.awscdk.services.ecs.DevicePermission.MKNOD)

  case object Read
    extends DevicePermission(software.amazon.awscdk.services.ecs.DevicePermission.READ)

  case object Write
    extends DevicePermission(software.amazon.awscdk.services.ecs.DevicePermission.WRITE)
}
