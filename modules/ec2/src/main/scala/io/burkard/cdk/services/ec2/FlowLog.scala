package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FlowLog {

  def apply(
    internalResourceId: String,
    flowLogName: Option[String] = None,
    resourceType: Option[software.amazon.awscdk.services.ec2.FlowLogResourceType] = None,
    trafficType: Option[software.amazon.awscdk.services.ec2.FlowLogTrafficType] = None,
    destination: Option[software.amazon.awscdk.services.ec2.FlowLogDestination] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.FlowLog =
    software.amazon.awscdk.services.ec2.FlowLog.Builder
      .create(stackCtx, internalResourceId)
      .flowLogName(flowLogName.orNull)
      .resourceType(resourceType.orNull)
      .trafficType(trafficType.orNull)
      .destination(destination.orNull)
      .build()
}
