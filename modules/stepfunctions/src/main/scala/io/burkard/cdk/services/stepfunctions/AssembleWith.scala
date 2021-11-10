package io.burkard.cdk.services.stepfunctions


sealed abstract class AssembleWith(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith)
  extends Product
    with Serializable


object AssembleWith {
  implicit def toAws(value: AssembleWith): software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith =
    Option(value).map(_.underlying).orNull

  case object None
    extends AssembleWith(software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith.NONE)

  case object Line
    extends AssembleWith(software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith.LINE)
}
