package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConnectionsProps {

  def apply(
    defaultPort: Option[software.amazon.awscdk.services.ec2.Port] = None,
    peer: Option[software.amazon.awscdk.services.ec2.IPeer] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None
  ): software.amazon.awscdk.services.ec2.ConnectionsProps =
    (new software.amazon.awscdk.services.ec2.ConnectionsProps.Builder)
      .defaultPort(defaultPort.orNull)
      .peer(peer.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
