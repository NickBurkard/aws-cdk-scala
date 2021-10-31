package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomerGatewayProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    bgpAsn: Option[Number] = None,
    ipAddress: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps =
    (new software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .bgpAsn(bgpAsn.orNull)
      .ipAddress(ipAddress.orNull)
      .`type`(`type`.orNull)
      .build()
}
