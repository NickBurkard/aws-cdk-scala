package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcEndpointService {

  def apply(
    internalResourceId: String,
    vpcEndpointServiceLoadBalancers: Option[List[_ <: software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer]] = None,
    allowedPrincipals: Option[List[_ <: software.amazon.awscdk.services.iam.ArnPrincipal]] = None,
    acceptanceRequired: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.VpcEndpointService =
    software.amazon.awscdk.services.ec2.VpcEndpointService.Builder
      .create(stackCtx, internalResourceId)
      .vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers.map(_.asJava).orNull)
      .allowedPrincipals(allowedPrincipals.map(_.asJava).orNull)
      .acceptanceRequired(acceptanceRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
