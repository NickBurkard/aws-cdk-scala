package io.burkard.cdk.services.ec2

sealed abstract class NatTrafficDirection(val underlying: software.amazon.awscdk.services.ec2.NatTrafficDirection)
  extends Product
    with Serializable

object NatTrafficDirection {
  implicit def toAws(value: NatTrafficDirection): software.amazon.awscdk.services.ec2.NatTrafficDirection =
    Option(value).map(_.underlying).orNull

  case object InboundAndOutbound
    extends NatTrafficDirection(software.amazon.awscdk.services.ec2.NatTrafficDirection.INBOUND_AND_OUTBOUND)

  case object None
    extends NatTrafficDirection(software.amazon.awscdk.services.ec2.NatTrafficDirection.NONE)

  case object OutboundOnly
    extends NatTrafficDirection(software.amazon.awscdk.services.ec2.NatTrafficDirection.OUTBOUND_ONLY)
}
