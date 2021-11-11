package io.burkard.cdk.services.ecs

sealed abstract class NetworkMode(val underlying: software.amazon.awscdk.services.ecs.NetworkMode)
  extends Product
    with Serializable

object NetworkMode {
  implicit def toAws(value: NetworkMode): software.amazon.awscdk.services.ecs.NetworkMode =
    Option(value).map(_.underlying).orNull

  case object None
    extends NetworkMode(software.amazon.awscdk.services.ecs.NetworkMode.NONE)

  case object Bridge
    extends NetworkMode(software.amazon.awscdk.services.ecs.NetworkMode.BRIDGE)

  case object AwsVpc
    extends NetworkMode(software.amazon.awscdk.services.ecs.NetworkMode.AWS_VPC)

  case object Host
    extends NetworkMode(software.amazon.awscdk.services.ecs.NetworkMode.HOST)

  case object Nat
    extends NetworkMode(software.amazon.awscdk.services.ecs.NetworkMode.NAT)
}
