package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClusterSubnetGroup {

  def apply(
    internalResourceId: String,
    subnetIds: Option[List[String]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup =
    software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
