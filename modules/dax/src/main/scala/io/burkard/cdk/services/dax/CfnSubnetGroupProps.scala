package io.burkard.cdk.services.dax

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSubnetGroupProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    subnetGroupName: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.dax.CfnSubnetGroupProps =
    (new software.amazon.awscdk.services.dax.CfnSubnetGroupProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .subnetGroupName(subnetGroupName.orNull)
      .description(description.orNull)
      .build()
}
