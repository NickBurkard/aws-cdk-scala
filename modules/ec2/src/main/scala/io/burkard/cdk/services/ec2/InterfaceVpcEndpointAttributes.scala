package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InterfaceVpcEndpointAttributes {

  def apply(
    port: Option[Number] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpcEndpointId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes =
    (new software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes.Builder)
      .port(port.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpcEndpointId(vpcEndpointId.orNull)
      .build()
}
