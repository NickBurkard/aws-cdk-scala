package io.burkard.cdk.services.stepfunctions

sealed abstract class InstanceRoleType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType)
  extends Product
    with Serializable

object InstanceRoleType {
  implicit def toAws(value: InstanceRoleType): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType =
    Option(value).map(_.underlying).orNull

  case object Master
    extends InstanceRoleType(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.MASTER)

  case object Core
    extends InstanceRoleType(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.CORE)

  case object Task
    extends InstanceRoleType(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.TASK)
}
