package io.burkard.cdk.services.ecs


sealed abstract class IpcMode(val underlying: software.amazon.awscdk.services.ecs.IpcMode)
  extends Product
    with Serializable


object IpcMode {
  implicit def toAws(value: IpcMode): software.amazon.awscdk.services.ecs.IpcMode =
    Option(value).map(_.underlying).orNull

  case object None
    extends IpcMode(software.amazon.awscdk.services.ecs.IpcMode.NONE)

  case object Host
    extends IpcMode(software.amazon.awscdk.services.ecs.IpcMode.HOST)

  case object Task
    extends IpcMode(software.amazon.awscdk.services.ecs.IpcMode.TASK)
}
