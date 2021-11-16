package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InterfaceVpcEndpointProps {

  def apply(
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    subnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    lookupSupportedAzs: Option[Boolean] = None,
    open: Option[Boolean] = None,
    service: Option[software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService] = None,
    privateDnsEnabled: Option[Boolean] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None
  ): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps =
    (new software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps.Builder)
      .vpc(vpc)
      .subnets(subnets.orNull)
      .lookupSupportedAzs(lookupSupportedAzs.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .open(open.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .service(service.orNull)
      .privateDnsEnabled(privateDnsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
