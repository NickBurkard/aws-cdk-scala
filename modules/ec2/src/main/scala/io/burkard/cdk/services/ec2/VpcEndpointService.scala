package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcEndpointService {

  def apply(
    internalResourceId: String,
    vpcEndpointServiceLoadBalancers: List[_ <: software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer],
    whitelistedPrincipals: Option[List[_ <: software.amazon.awscdk.services.iam.ArnPrincipal]] = None,
    vpcEndpointServiceName: Option[String] = None,
    allowedPrincipals: Option[List[_ <: software.amazon.awscdk.services.iam.ArnPrincipal]] = None,
    acceptanceRequired: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.VpcEndpointService =
    software.amazon.awscdk.services.ec2.VpcEndpointService.Builder
      .create(stackCtx, internalResourceId)
      .vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers.asJava)
      .whitelistedPrincipals(whitelistedPrincipals.map(_.asJava).orNull)
      .vpcEndpointServiceName(vpcEndpointServiceName.orNull)
      .allowedPrincipals(allowedPrincipals.map(_.asJava).orNull)
      .acceptanceRequired(acceptanceRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
