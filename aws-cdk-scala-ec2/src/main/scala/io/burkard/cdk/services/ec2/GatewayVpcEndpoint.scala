package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayVpcEndpoint {

  def apply(
    internalResourceId: String,
    subnets: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None,
    service: Option[software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.GatewayVpcEndpoint =
    software.amazon.awscdk.services.ec2.GatewayVpcEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .subnets(subnets.map(_.asJava).orNull)
      .service(service.orNull)
      .vpc(vpc.orNull)
      .build()
}
