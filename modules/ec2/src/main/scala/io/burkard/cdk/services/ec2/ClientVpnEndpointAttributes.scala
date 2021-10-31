package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientVpnEndpointAttributes {

  def apply(
    endpointId: Option[String] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes =
    (new software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes.Builder)
      .endpointId(endpointId.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
