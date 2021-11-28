package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcEndpointServiceProps {

  def apply(
    vpcEndpointServiceLoadBalancers: List[_ <: software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer],
    allowedPrincipals: Option[List[_ <: software.amazon.awscdk.services.iam.ArnPrincipal]] = None,
    acceptanceRequired: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.VpcEndpointServiceProps =
    (new software.amazon.awscdk.services.ec2.VpcEndpointServiceProps.Builder)
      .vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers.asJava)
      .allowedPrincipals(allowedPrincipals.map(_.asJava).orNull)
      .acceptanceRequired(acceptanceRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
