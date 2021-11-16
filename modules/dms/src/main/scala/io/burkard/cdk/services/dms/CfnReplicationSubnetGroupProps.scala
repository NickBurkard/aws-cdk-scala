package io.burkard.cdk.services.dms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReplicationSubnetGroupProps {

  def apply(
    subnetIds: List[String],
    replicationSubnetGroupDescription: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    replicationSubnetGroupIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps =
    (new software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.Builder)
      .subnetIds(subnetIds.asJava)
      .replicationSubnetGroupDescription(replicationSubnetGroupDescription)
      .tags(tags.map(_.asJava).orNull)
      .replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier.orNull)
      .build()
}
