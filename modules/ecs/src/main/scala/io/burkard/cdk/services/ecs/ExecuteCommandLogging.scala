package io.burkard.cdk.services.ecs

sealed abstract class ExecuteCommandLogging(val underlying: software.amazon.awscdk.services.ecs.ExecuteCommandLogging)
  extends Product
    with Serializable

object ExecuteCommandLogging {
  implicit def toAws(value: ExecuteCommandLogging): software.amazon.awscdk.services.ecs.ExecuteCommandLogging =
    Option(value).map(_.underlying).orNull

  case object Default
    extends ExecuteCommandLogging(software.amazon.awscdk.services.ecs.ExecuteCommandLogging.DEFAULT)

  case object None
    extends ExecuteCommandLogging(software.amazon.awscdk.services.ecs.ExecuteCommandLogging.NONE)

  case object Override
    extends ExecuteCommandLogging(software.amazon.awscdk.services.ecs.ExecuteCommandLogging.OVERRIDE)
}
