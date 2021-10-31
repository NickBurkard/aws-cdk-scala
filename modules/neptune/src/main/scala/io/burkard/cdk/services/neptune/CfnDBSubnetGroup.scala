package io.burkard.cdk.services.neptune

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBSubnetGroup {

  def apply(
    internalResourceId: String,
    subnetIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dbSubnetGroupDescription: Option[String] = None,
    dbSubnetGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.neptune.CfnDBSubnetGroup =
    software.amazon.awscdk.services.neptune.CfnDBSubnetGroup.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .dbSubnetGroupDescription(dbSubnetGroupDescription.orNull)
      .dbSubnetGroupName(dbSubnetGroupName.orNull)
      .build()
}
