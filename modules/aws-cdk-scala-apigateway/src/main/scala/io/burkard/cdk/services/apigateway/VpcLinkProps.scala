package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcLinkProps {

  def apply(
    targets: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer]] = None,
    description: Option[String] = None,
    vpcLinkName: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.VpcLinkProps =
    (new software.amazon.awscdk.services.apigateway.VpcLinkProps.Builder)
      .targets(targets.map(_.asJava).orNull)
      .description(description.orNull)
      .vpcLinkName(vpcLinkName.orNull)
      .build()
}
