package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayVpcEndpointOptions {

  def apply(
    subnets: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None,
    service: Option[software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService] = None
  ): software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions =
    (new software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions.Builder)
      .subnets(subnets.map(_.asJava).orNull)
      .service(service.orNull)
      .build()
}
