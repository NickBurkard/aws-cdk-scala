package io.burkard.cdk.services.dax

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetGroupProps {

  def apply(
    subnetIds: List[String],
    subnetGroupName: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.dax.CfnSubnetGroupProps =
    (new software.amazon.awscdk.services.dax.CfnSubnetGroupProps.Builder)
      .subnetIds(subnetIds.asJava)
      .subnetGroupName(subnetGroupName.orNull)
      .description(description.orNull)
      .build()
}
