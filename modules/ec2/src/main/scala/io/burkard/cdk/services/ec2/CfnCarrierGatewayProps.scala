package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCarrierGatewayProps {

  def apply(
    vpcId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnCarrierGatewayProps =
    (new software.amazon.awscdk.services.ec2.CfnCarrierGatewayProps.Builder)
      .vpcId(vpcId)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
