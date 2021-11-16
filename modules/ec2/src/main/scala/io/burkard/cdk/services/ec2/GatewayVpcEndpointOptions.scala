package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayVpcEndpointOptions {

  def apply(
    service: software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService,
    subnets: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None
  ): software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions =
    (new software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions.Builder)
      .service(service)
      .subnets(subnets.map(_.asJava).orNull)
      .build()
}
