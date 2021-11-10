package io.burkard.cdk.services.stepfunctions


sealed abstract class Mode(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.Mode)
  extends Product
    with Serializable


object Mode {
  implicit def toAws(value: Mode): software.amazon.awscdk.services.stepfunctions.tasks.Mode =
    Option(value).map(_.underlying).orNull

  case object SingleModel
    extends Mode(software.amazon.awscdk.services.stepfunctions.tasks.Mode.SINGLE_MODEL)

  case object MultiModel
    extends Mode(software.amazon.awscdk.services.stepfunctions.tasks.Mode.MULTI_MODEL)
}
