package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterSubnetGroupProps {

  def apply(
    subnetIds: List[String],
    description: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps =
    (new software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps.Builder)
      .subnetIds(subnetIds.asJava)
      .description(description)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
