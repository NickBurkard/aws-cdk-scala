package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
