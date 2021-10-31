package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
