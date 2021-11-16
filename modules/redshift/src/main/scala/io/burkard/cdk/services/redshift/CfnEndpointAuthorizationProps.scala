package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEndpointAuthorizationProps {

  def apply(
    clusterIdentifier: String,
    account: String,
    force: Option[Boolean] = None,
    vpcIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps =
    (new software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps.Builder)
      .clusterIdentifier(clusterIdentifier)
      .account(account)
      .force(force.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcIds(vpcIds.map(_.asJava).orNull)
      .build()
}
