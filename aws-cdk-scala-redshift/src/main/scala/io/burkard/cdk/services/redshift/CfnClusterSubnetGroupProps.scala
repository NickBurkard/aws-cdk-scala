package io.burkard.cdk.services.redshift

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClusterSubnetGroupProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps =
    (new software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
