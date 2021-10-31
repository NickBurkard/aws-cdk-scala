package io.burkard.cdk.services.docdb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBSubnetGroupProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dbSubnetGroupDescription: Option[String] = None,
    dbSubnetGroupName: Option[String] = None
  ): software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps =
    (new software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .dbSubnetGroupDescription(dbSubnetGroupDescription.orNull)
      .dbSubnetGroupName(dbSubnetGroupName.orNull)
      .build()
}
