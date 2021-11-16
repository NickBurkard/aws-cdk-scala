package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomerGatewayProps {

  def apply(
    bgpAsn: Number,
    ipAddress: String,
    `type`: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps =
    (new software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps.Builder)
      .bgpAsn(bgpAsn)
      .ipAddress(ipAddress)
      .`type`(`type`)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
