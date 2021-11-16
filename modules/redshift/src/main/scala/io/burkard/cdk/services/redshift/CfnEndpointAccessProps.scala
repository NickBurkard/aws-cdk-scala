package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEndpointAccessProps {

  def apply(
    vpcSecurityGroupIds: List[String],
    endpointName: String,
    subnetGroupName: Option[String] = None,
    clusterIdentifier: Option[String] = None,
    resourceOwner: Option[String] = None
  ): software.amazon.awscdk.services.redshift.CfnEndpointAccessProps =
    (new software.amazon.awscdk.services.redshift.CfnEndpointAccessProps.Builder)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.asJava)
      .endpointName(endpointName)
      .subnetGroupName(subnetGroupName.orNull)
      .clusterIdentifier(clusterIdentifier.orNull)
      .resourceOwner(resourceOwner.orNull)
      .build()
}
