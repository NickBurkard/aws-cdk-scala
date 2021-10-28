package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseInstanceAttributes {

  def apply(
    instanceEndpointAddress: Option[String] = None,
    instanceIdentifier: Option[String] = None,
    port: Option[Number] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    engine: Option[software.amazon.awscdk.services.rds.IInstanceEngine] = None
  ): software.amazon.awscdk.services.rds.DatabaseInstanceAttributes =
    (new software.amazon.awscdk.services.rds.DatabaseInstanceAttributes.Builder)
      .instanceEndpointAddress(instanceEndpointAddress.orNull)
      .instanceIdentifier(instanceIdentifier.orNull)
      .port(port.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .engine(engine.orNull)
      .build()
}
