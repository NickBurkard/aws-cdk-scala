package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
