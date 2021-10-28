package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCEndpointProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    vpcId: Option[String] = None,
    serviceName: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    privateDnsEnabled: Option[Boolean] = None,
    vpcEndpointType: Option[String] = None,
    policyDocument: Option[AnyRef] = None,
    routeTableIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCEndpointProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCEndpointProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .vpcId(vpcId.orNull)
      .serviceName(serviceName.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .privateDnsEnabled(privateDnsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcEndpointType(vpcEndpointType.orNull)
      .policyDocument(policyDocument.orNull)
      .routeTableIds(routeTableIds.map(_.asJava).orNull)
      .build()
}
