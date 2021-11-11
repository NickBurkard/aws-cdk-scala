package io.burkard.cdk.services.stepfunctions

sealed abstract class EmrClusterScaleDownBehavior(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior)
  extends Product
    with Serializable

object EmrClusterScaleDownBehavior {
  implicit def toAws(value: EmrClusterScaleDownBehavior): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior =
    Option(value).map(_.underlying).orNull

  case object TerminateAtInstanceHour
    extends EmrClusterScaleDownBehavior(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior.TERMINATE_AT_INSTANCE_HOUR)

  case object TerminateAtTaskCompletion
    extends EmrClusterScaleDownBehavior(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior.TERMINATE_AT_TASK_COMPLETION)
}
