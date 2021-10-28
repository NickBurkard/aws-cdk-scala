package io.burkard.cdk.services.stepfunctions

sealed abstract class InstanceMarket(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket)
  extends Product
    with Serializable

object InstanceMarket {
  implicit def toAws(value: InstanceMarket): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket =
    Option(value).map(_.underlying).orNull

  case object OnDemand
    extends InstanceMarket(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket.ON_DEMAND)

  case object Spot
    extends InstanceMarket(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket.SPOT)
}
