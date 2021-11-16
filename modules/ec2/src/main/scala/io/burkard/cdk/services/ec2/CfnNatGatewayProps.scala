package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNatGatewayProps {

  def apply(
    subnetId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    allocationId: Option[String] = None,
    connectivityType: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNatGatewayProps =
    (new software.amazon.awscdk.services.ec2.CfnNatGatewayProps.Builder)
      .subnetId(subnetId)
      .tags(tags.map(_.asJava).orNull)
      .allocationId(allocationId.orNull)
      .connectivityType(connectivityType.orNull)
      .build()
}
