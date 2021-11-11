package io.burkard.cdk.services.ec2

sealed abstract class VpcEndpointType(val underlying: software.amazon.awscdk.services.ec2.VpcEndpointType)
  extends Product
    with Serializable

object VpcEndpointType {
  implicit def toAws(value: VpcEndpointType): software.amazon.awscdk.services.ec2.VpcEndpointType =
    Option(value).map(_.underlying).orNull

  case object Interface
    extends VpcEndpointType(software.amazon.awscdk.services.ec2.VpcEndpointType.INTERFACE)

  case object Gateway
    extends VpcEndpointType(software.amazon.awscdk.services.ec2.VpcEndpointType.GATEWAY)
}
