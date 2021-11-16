package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientVpnEndpointAttributes {

  def apply(
    endpointId: String,
    securityGroups: List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]
  ): software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes =
    (new software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes.Builder)
      .endpointId(endpointId)
      .securityGroups(securityGroups.asJava)
      .build()
}
