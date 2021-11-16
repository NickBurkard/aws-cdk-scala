package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FlowLogProps {

  def apply(
    resourceType: software.amazon.awscdk.services.ec2.FlowLogResourceType,
    flowLogName: Option[String] = None,
    trafficType: Option[software.amazon.awscdk.services.ec2.FlowLogTrafficType] = None,
    destination: Option[software.amazon.awscdk.services.ec2.FlowLogDestination] = None
  ): software.amazon.awscdk.services.ec2.FlowLogProps =
    (new software.amazon.awscdk.services.ec2.FlowLogProps.Builder)
      .resourceType(resourceType)
      .flowLogName(flowLogName.orNull)
      .trafficType(trafficType.orNull)
      .destination(destination.orNull)
      .build()
}
