package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndpointConfiguration {

  def apply(
    types: List[_ <: software.amazon.awscdk.services.apigateway.EndpointType],
    vpcEndpoints: Option[List[_ <: software.amazon.awscdk.services.ec2.IVpcEndpoint]] = None
  ): software.amazon.awscdk.services.apigateway.EndpointConfiguration =
    (new software.amazon.awscdk.services.apigateway.EndpointConfiguration.Builder)
      .types(types.asJava)
      .vpcEndpoints(vpcEndpoints.map(_.asJava).orNull)
      .build()
}
