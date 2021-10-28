package io.burkard.cdk.services.stepfunctions

sealed abstract class ActionOnFailure(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure)
  extends Product
    with Serializable

object ActionOnFailure {
  implicit def toAws(value: ActionOnFailure): software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure =
    Option(value).map(_.underlying).orNull

  case object TerminateCluster
    extends ActionOnFailure(software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure.TERMINATE_CLUSTER)

  case object CancelAndWait
    extends ActionOnFailure(software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure.CANCEL_AND_WAIT)

  case object Continue
    extends ActionOnFailure(software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure.CONTINUE)
}
