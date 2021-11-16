package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPNGatewayProps {

  def apply(
    `type`: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    amazonSideAsn: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnVPNGatewayProps =
    (new software.amazon.awscdk.services.ec2.CfnVPNGatewayProps.Builder)
      .`type`(`type`)
      .tags(tags.map(_.asJava).orNull)
      .amazonSideAsn(amazonSideAsn.orNull)
      .build()
}
