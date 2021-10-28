package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EndpointConfigurationProperty {

  def apply(
    vpcEndpointIds: Option[List[String]] = None,
    types: Option[List[String]] = None
  ): software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty =
    (new software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty.Builder)
      .vpcEndpointIds(vpcEndpointIds.map(_.asJava).orNull)
      .types(types.map(_.asJava).orNull)
      .build()
}
