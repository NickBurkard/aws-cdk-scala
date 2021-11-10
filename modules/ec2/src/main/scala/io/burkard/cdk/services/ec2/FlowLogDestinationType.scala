package io.burkard.cdk.services.ec2


sealed abstract class FlowLogDestinationType(val underlying: software.amazon.awscdk.services.ec2.FlowLogDestinationType)
  extends Product
    with Serializable


object FlowLogDestinationType {
  implicit def toAws(value: FlowLogDestinationType): software.amazon.awscdk.services.ec2.FlowLogDestinationType =
    Option(value).map(_.underlying).orNull

  case object CloudWatchLogs
    extends FlowLogDestinationType(software.amazon.awscdk.services.ec2.FlowLogDestinationType.CLOUD_WATCH_LOGS)

  case object S3
    extends FlowLogDestinationType(software.amazon.awscdk.services.ec2.FlowLogDestinationType.S3)
}
