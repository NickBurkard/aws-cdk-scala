package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayVpcEndpointProps {

  def apply(
    subnets: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None,
    service: Option[software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps =
    (new software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps.Builder)
      .subnets(subnets.map(_.asJava).orNull)
      .service(service.orNull)
      .vpc(vpc.orNull)
      .build()
}
