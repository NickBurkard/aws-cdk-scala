package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBSubnetGroupProps {

  def apply(
    subnetIds: List[String],
    dbSubnetGroupDescription: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dbSubnetGroupName: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps =
    (new software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps.Builder)
      .subnetIds(subnetIds.asJava)
      .dbSubnetGroupDescription(dbSubnetGroupDescription)
      .tags(tags.map(_.asJava).orNull)
      .dbSubnetGroupName(dbSubnetGroupName.orNull)
      .build()
}
