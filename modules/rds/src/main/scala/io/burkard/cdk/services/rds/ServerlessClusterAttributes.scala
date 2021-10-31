package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerlessClusterAttributes {

  def apply(
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    clusterIdentifier: Option[String] = None,
    clusterEndpointAddress: Option[String] = None,
    port: Option[Number] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    readerEndpointAddress: Option[String] = None
  ): software.amazon.awscdk.services.rds.ServerlessClusterAttributes =
    (new software.amazon.awscdk.services.rds.ServerlessClusterAttributes.Builder)
      .secret(secret.orNull)
      .clusterIdentifier(clusterIdentifier.orNull)
      .clusterEndpointAddress(clusterEndpointAddress.orNull)
      .port(port.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .readerEndpointAddress(readerEndpointAddress.orNull)
      .build()
}
