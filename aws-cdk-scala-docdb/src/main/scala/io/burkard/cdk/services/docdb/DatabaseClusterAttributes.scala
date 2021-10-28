package io.burkard.cdk.services.docdb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseClusterAttributes {

  def apply(
    clusterIdentifier: Option[String] = None,
    clusterEndpointAddress: Option[String] = None,
    port: Option[Number] = None,
    instanceEndpointAddresses: Option[List[String]] = None,
    instanceIdentifiers: Option[List[String]] = None,
    readerEndpointAddress: Option[String] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.docdb.DatabaseClusterAttributes =
    (new software.amazon.awscdk.services.docdb.DatabaseClusterAttributes.Builder)
      .clusterIdentifier(clusterIdentifier.orNull)
      .clusterEndpointAddress(clusterEndpointAddress.orNull)
      .port(port.orNull)
      .instanceEndpointAddresses(instanceEndpointAddresses.map(_.asJava).orNull)
      .instanceIdentifiers(instanceIdentifiers.map(_.asJava).orNull)
      .readerEndpointAddress(readerEndpointAddress.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
