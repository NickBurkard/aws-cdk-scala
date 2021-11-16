package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomerGateway {

  def apply(
    internalResourceId: String,
    bgpAsn: Number,
    ipAddress: String,
    `type`: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnCustomerGateway =
    software.amazon.awscdk.services.ec2.CfnCustomerGateway.Builder
      .create(stackCtx, internalResourceId)
      .bgpAsn(bgpAsn)
      .ipAddress(ipAddress)
      .`type`(`type`)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
