package io.burkard.cdk.services.docdb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseClusterAttributes {

  def apply(
    clusterIdentifier: String,
    clusterEndpointAddress: String,
    port: Number,
    instanceEndpointAddresses: List[String],
    instanceIdentifiers: List[String],
    readerEndpointAddress: String,
    securityGroup: software.amazon.awscdk.services.ec2.ISecurityGroup
  ): software.amazon.awscdk.services.docdb.DatabaseClusterAttributes =
    (new software.amazon.awscdk.services.docdb.DatabaseClusterAttributes.Builder)
      .clusterIdentifier(clusterIdentifier)
      .clusterEndpointAddress(clusterEndpointAddress)
      .port(port)
      .instanceEndpointAddresses(instanceEndpointAddresses.asJava)
      .instanceIdentifiers(instanceIdentifiers.asJava)
      .readerEndpointAddress(readerEndpointAddress)
      .securityGroup(securityGroup)
      .build()
}
