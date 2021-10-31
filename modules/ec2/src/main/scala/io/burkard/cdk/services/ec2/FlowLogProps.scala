package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FlowLogProps {

  def apply(
    flowLogName: Option[String] = None,
    resourceType: Option[software.amazon.awscdk.services.ec2.FlowLogResourceType] = None,
    trafficType: Option[software.amazon.awscdk.services.ec2.FlowLogTrafficType] = None,
    destination: Option[software.amazon.awscdk.services.ec2.FlowLogDestination] = None
  ): software.amazon.awscdk.services.ec2.FlowLogProps =
    (new software.amazon.awscdk.services.ec2.FlowLogProps.Builder)
      .flowLogName(flowLogName.orNull)
      .resourceType(resourceType.orNull)
      .trafficType(trafficType.orNull)
      .destination(destination.orNull)
      .build()
}
