package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBSubnetGroupProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dbSubnetGroupDescription: Option[String] = None,
    dbSubnetGroupName: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps =
    (new software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .dbSubnetGroupDescription(dbSubnetGroupDescription.orNull)
      .dbSubnetGroupName(dbSubnetGroupName.orNull)
      .build()
}
