package io.burkard.cdk.services.dms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReplicationSubnetGroupProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    replicationSubnetGroupDescription: Option[String] = None,
    replicationSubnetGroupIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps =
    (new software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .replicationSubnetGroupDescription(replicationSubnetGroupDescription.orNull)
      .replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier.orNull)
      .build()
}
