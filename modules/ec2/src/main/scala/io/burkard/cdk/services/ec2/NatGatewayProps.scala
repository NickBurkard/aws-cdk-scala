package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NatGatewayProps {

  def apply(
    eipAllocationIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.NatGatewayProps =
    (new software.amazon.awscdk.services.ec2.NatGatewayProps.Builder)
      .eipAllocationIds(eipAllocationIds.map(_.asJava).orNull)
      .build()
}
