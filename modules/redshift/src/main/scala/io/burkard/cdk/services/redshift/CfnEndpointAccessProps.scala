package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEndpointAccessProps {

  def apply(
    subnetGroupName: Option[String] = None,
    vpcSecurityGroupIds: Option[List[String]] = None,
    clusterIdentifier: Option[String] = None,
    resourceOwner: Option[String] = None,
    endpointName: Option[String] = None
  ): software.amazon.awscdk.services.redshift.CfnEndpointAccessProps =
    (new software.amazon.awscdk.services.redshift.CfnEndpointAccessProps.Builder)
      .subnetGroupName(subnetGroupName.orNull)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .clusterIdentifier(clusterIdentifier.orNull)
      .resourceOwner(resourceOwner.orNull)
      .endpointName(endpointName.orNull)
      .build()
}
