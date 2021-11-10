package io.burkard.cdk.services.ec2


sealed abstract class FlowLogTrafficType(val underlying: software.amazon.awscdk.services.ec2.FlowLogTrafficType)
  extends Product
    with Serializable


object FlowLogTrafficType {
  implicit def toAws(value: FlowLogTrafficType): software.amazon.awscdk.services.ec2.FlowLogTrafficType =
    Option(value).map(_.underlying).orNull

  case object Accept
    extends FlowLogTrafficType(software.amazon.awscdk.services.ec2.FlowLogTrafficType.ACCEPT)

  case object All
    extends FlowLogTrafficType(software.amazon.awscdk.services.ec2.FlowLogTrafficType.ALL)

  case object Reject
    extends FlowLogTrafficType(software.amazon.awscdk.services.ec2.FlowLogTrafficType.REJECT)
}
