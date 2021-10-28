package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InterfaceVpcEndpointOptions {

  def apply(
    subnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    lookupSupportedAzs: Option[Boolean] = None,
    open: Option[Boolean] = None,
    service: Option[software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService] = None,
    privateDnsEnabled: Option[Boolean] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None
  ): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions =
    (new software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions.Builder)
      .subnets(subnets.orNull)
      .lookupSupportedAzs(lookupSupportedAzs.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .open(open.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .service(service.orNull)
      .privateDnsEnabled(privateDnsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
