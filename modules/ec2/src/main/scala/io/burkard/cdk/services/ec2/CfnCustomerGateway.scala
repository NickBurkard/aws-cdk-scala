package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCustomerGateway {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    bgpAsn: Option[Number] = None,
    ipAddress: Option[String] = None,
    `type`: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnCustomerGateway =
    software.amazon.awscdk.services.ec2.CfnCustomerGateway.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .bgpAsn(bgpAsn.orNull)
      .ipAddress(ipAddress.orNull)
      .`type`(`type`.orNull)
      .build()
}
