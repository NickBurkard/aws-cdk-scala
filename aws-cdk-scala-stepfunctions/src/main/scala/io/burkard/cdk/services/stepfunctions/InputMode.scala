package io.burkard.cdk.services.stepfunctions

sealed abstract class InputMode(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.InputMode)
  extends Product
    with Serializable

object InputMode {
  implicit def toAws(value: InputMode): software.amazon.awscdk.services.stepfunctions.tasks.InputMode =
    Option(value).map(_.underlying).orNull

  case object Pipe
    extends InputMode(software.amazon.awscdk.services.stepfunctions.tasks.InputMode.PIPE)

  case object File
    extends InputMode(software.amazon.awscdk.services.stepfunctions.tasks.InputMode.FILE)
}
