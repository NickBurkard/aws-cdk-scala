package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EndpointConfigurationProperty {

  def apply(
    vpcEndpointIds: Option[List[String]] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty =
    (new software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty.Builder)
      .vpcEndpointIds(vpcEndpointIds.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
