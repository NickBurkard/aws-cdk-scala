package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCEndpoint {

  def apply(
    internalResourceId: String,
    subnetIds: Option[List[String]] = None,
    vpcId: Option[String] = None,
    serviceName: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    privateDnsEnabled: Option[Boolean] = None,
    vpcEndpointType: Option[String] = None,
    policyDocument: Option[AnyRef] = None,
    routeTableIds: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCEndpoint =
    software.amazon.awscdk.services.ec2.CfnVPCEndpoint.Builder
      .create(stackCtx, internalResourceId)
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
