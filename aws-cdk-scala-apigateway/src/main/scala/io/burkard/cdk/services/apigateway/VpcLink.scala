package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcLink {

  def apply(
    internalResourceId: String,
    targets: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer]] = None,
    description: Option[String] = None,
    vpcLinkName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.VpcLink =
    software.amazon.awscdk.services.apigateway.VpcLink.Builder
      .create(stackCtx, internalResourceId)
      .targets(targets.map(_.asJava).orNull)
      .description(description.orNull)
      .vpcLinkName(vpcLinkName.orNull)
      .build()
}
