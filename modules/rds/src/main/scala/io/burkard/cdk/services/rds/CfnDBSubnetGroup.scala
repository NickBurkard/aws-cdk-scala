package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBSubnetGroup {

  def apply(
    internalResourceId: String,
    subnetIds: List[String],
    dbSubnetGroupDescription: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dbSubnetGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.CfnDBSubnetGroup =
    software.amazon.awscdk.services.rds.CfnDBSubnetGroup.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.asJava)
      .dbSubnetGroupDescription(dbSubnetGroupDescription)
      .tags(tags.map(_.asJava).orNull)
      .dbSubnetGroupName(dbSubnetGroupName.orNull)
      .build()
}
