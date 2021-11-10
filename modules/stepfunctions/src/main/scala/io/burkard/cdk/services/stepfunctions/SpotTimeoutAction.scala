package io.burkard.cdk.services.stepfunctions


sealed abstract class SpotTimeoutAction(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction)
  extends Product
    with Serializable


object SpotTimeoutAction {
  implicit def toAws(value: SpotTimeoutAction): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction =
    Option(value).map(_.underlying).orNull

  case object SwitchToOnDemand
    extends SpotTimeoutAction(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction.SWITCH_TO_ON_DEMAND)

  case object TerminateCluster
    extends SpotTimeoutAction(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction.TERMINATE_CLUSTER)
}
