package io.burkard.cdk.services.ec2


sealed abstract class TrafficDirection(val underlying: software.amazon.awscdk.services.ec2.TrafficDirection)
  extends Product
    with Serializable


object TrafficDirection {
  implicit def toAws(value: TrafficDirection): software.amazon.awscdk.services.ec2.TrafficDirection =
    Option(value).map(_.underlying).orNull

  case object Egress
    extends TrafficDirection(software.amazon.awscdk.services.ec2.TrafficDirection.EGRESS)

  case object Ingress
    extends TrafficDirection(software.amazon.awscdk.services.ec2.TrafficDirection.INGRESS)
}
