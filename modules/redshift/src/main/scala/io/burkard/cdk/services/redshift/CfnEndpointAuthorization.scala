package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEndpointAuthorization {

  def apply(
    internalResourceId: String,
    clusterIdentifier: String,
    account: String,
    force: Option[Boolean] = None,
    vpcIds: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.redshift.CfnEndpointAuthorization =
    software.amazon.awscdk.services.redshift.CfnEndpointAuthorization.Builder
      .create(stackCtx, internalResourceId)
      .clusterIdentifier(clusterIdentifier)
      .account(account)
      .force(force.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcIds(vpcIds.map(_.asJava).orNull)
      .build()
}
