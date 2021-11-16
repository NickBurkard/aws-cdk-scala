package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseClusterAttributes {

  def apply(
    clusterIdentifier: String,
    clusterEndpointAddress: Option[String] = None,
    port: Option[Number] = None,
    instanceEndpointAddresses: Option[List[String]] = None,
    instanceIdentifiers: Option[List[String]] = None,
    engine: Option[software.amazon.awscdk.services.rds.IClusterEngine] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    readerEndpointAddress: Option[String] = None
  ): software.amazon.awscdk.services.rds.DatabaseClusterAttributes =
    (new software.amazon.awscdk.services.rds.DatabaseClusterAttributes.Builder)
      .clusterIdentifier(clusterIdentifier)
      .clusterEndpointAddress(clusterEndpointAddress.orNull)
      .port(port.orNull)
      .instanceEndpointAddresses(instanceEndpointAddresses.map(_.asJava).orNull)
      .instanceIdentifiers(instanceIdentifiers.map(_.asJava).orNull)
      .engine(engine.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .readerEndpointAddress(readerEndpointAddress.orNull)
      .build()
}
