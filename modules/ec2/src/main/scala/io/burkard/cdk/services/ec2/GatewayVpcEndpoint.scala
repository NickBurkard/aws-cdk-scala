package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayVpcEndpoint {

  def apply(
    internalResourceId: String,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    subnets: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None,
    service: Option[software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.GatewayVpcEndpoint =
    software.amazon.awscdk.services.ec2.GatewayVpcEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .vpc(vpc)
      .subnets(subnets.map(_.asJava).orNull)
      .service(service.orNull)
      .build()
}
