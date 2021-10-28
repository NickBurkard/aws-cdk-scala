package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NatGatewayProps {

  def apply(
    eipAllocationIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.NatGatewayProps =
    (new software.amazon.awscdk.services.ec2.NatGatewayProps.Builder)
      .eipAllocationIds(eipAllocationIds.map(_.asJava).orNull)
      .build()
}
