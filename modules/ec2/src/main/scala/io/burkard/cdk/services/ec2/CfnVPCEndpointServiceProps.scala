package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCEndpointServiceProps {

  def apply(
    gatewayLoadBalancerArns: Option[List[String]] = None,
    networkLoadBalancerArns: Option[List[String]] = None,
    acceptanceRequired: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps.Builder)
      .gatewayLoadBalancerArns(gatewayLoadBalancerArns.map(_.asJava).orNull)
      .networkLoadBalancerArns(networkLoadBalancerArns.map(_.asJava).orNull)
      .acceptanceRequired(acceptanceRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
