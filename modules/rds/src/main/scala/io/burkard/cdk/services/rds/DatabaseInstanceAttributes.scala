package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseInstanceAttributes {

  def apply(
    instanceEndpointAddress: String,
    instanceIdentifier: String,
    port: Number,
    securityGroups: List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup],
    engine: Option[software.amazon.awscdk.services.rds.IInstanceEngine] = None
  ): software.amazon.awscdk.services.rds.DatabaseInstanceAttributes =
    (new software.amazon.awscdk.services.rds.DatabaseInstanceAttributes.Builder)
      .instanceEndpointAddress(instanceEndpointAddress)
      .instanceIdentifier(instanceIdentifier)
      .port(port)
      .securityGroups(securityGroups.asJava)
      .engine(engine.orNull)
      .build()
}
