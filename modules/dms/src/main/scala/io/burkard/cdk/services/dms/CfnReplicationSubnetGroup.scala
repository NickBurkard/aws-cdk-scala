package io.burkard.cdk.services.dms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReplicationSubnetGroup {

  def apply(
    internalResourceId: String,
    subnetIds: List[String],
    replicationSubnetGroupDescription: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    replicationSubnetGroupIdentifier: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup =
    software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.asJava)
      .replicationSubnetGroupDescription(replicationSubnetGroupDescription)
      .tags(tags.map(_.asJava).orNull)
      .replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier.orNull)
      .build()
}
