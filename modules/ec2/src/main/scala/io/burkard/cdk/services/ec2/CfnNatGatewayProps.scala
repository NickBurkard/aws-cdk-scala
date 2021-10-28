package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNatGatewayProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subnetId: Option[String] = None,
    allocationId: Option[String] = None,
    connectivityType: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNatGatewayProps =
    (new software.amazon.awscdk.services.ec2.CfnNatGatewayProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .subnetId(subnetId.orNull)
      .allocationId(allocationId.orNull)
      .connectivityType(connectivityType.orNull)
      .build()
}
