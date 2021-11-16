package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourcesVpcConfigProperty {

  def apply(
    subnetIds: List[String],
    securityGroupIds: Option[List[String]] = None,
    publicAccessCidrs: Option[List[String]] = None,
    endpointPublicAccess: Option[Boolean] = None,
    endpointPrivateAccess: Option[Boolean] = None
  ): software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty =
    (new software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty.Builder)
      .subnetIds(subnetIds.asJava)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .publicAccessCidrs(publicAccessCidrs.map(_.asJava).orNull)
      .endpointPublicAccess(endpointPublicAccess.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .endpointPrivateAccess(endpointPrivateAccess.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
