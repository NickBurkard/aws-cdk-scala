package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCarrierGatewayProps {

  def apply(
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnCarrierGatewayProps =
    (new software.amazon.awscdk.services.ec2.CfnCarrierGatewayProps.Builder)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
