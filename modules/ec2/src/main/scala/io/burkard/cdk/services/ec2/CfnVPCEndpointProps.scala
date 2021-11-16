package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCEndpointProps {

  def apply(
    vpcId: String,
    serviceName: String,
    subnetIds: Option[List[String]] = None,
    securityGroupIds: Option[List[String]] = None,
    privateDnsEnabled: Option[Boolean] = None,
    vpcEndpointType: Option[String] = None,
    policyDocument: Option[AnyRef] = None,
    routeTableIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCEndpointProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCEndpointProps.Builder)
      .vpcId(vpcId)
      .serviceName(serviceName)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .privateDnsEnabled(privateDnsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcEndpointType(vpcEndpointType.orNull)
      .policyDocument(policyDocument.orNull)
      .routeTableIds(routeTableIds.map(_.asJava).orNull)
      .build()
}
