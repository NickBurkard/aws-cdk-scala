package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EndpointConfiguration {

  def apply(
    vpcEndpoints: Option[List[_ <: software.amazon.awscdk.services.ec2.IVpcEndpoint]] = None,
    types: Option[List[_ <: software.amazon.awscdk.services.apigateway.EndpointType]] = None
  ): software.amazon.awscdk.services.apigateway.EndpointConfiguration =
    (new software.amazon.awscdk.services.apigateway.EndpointConfiguration.Builder)
      .vpcEndpoints(vpcEndpoints.map(_.asJava).orNull)
      .types(types.map(_.asJava).orNull)
      .build()
}
