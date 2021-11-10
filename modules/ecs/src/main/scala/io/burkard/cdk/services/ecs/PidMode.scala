package io.burkard.cdk.services.ecs


sealed abstract class PidMode(val underlying: software.amazon.awscdk.services.ecs.PidMode)
  extends Product
    with Serializable


object PidMode {
  implicit def toAws(value: PidMode): software.amazon.awscdk.services.ecs.PidMode =
    Option(value).map(_.underlying).orNull

  case object Host
    extends PidMode(software.amazon.awscdk.services.ecs.PidMode.HOST)

  case object Task
    extends PidMode(software.amazon.awscdk.services.ecs.PidMode.TASK)
}
