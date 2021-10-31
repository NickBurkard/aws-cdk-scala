package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcLookupOptions {

  def apply(
    vpcName: Option[String] = None,
    vpcId: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    subnetGroupNameTag: Option[String] = None,
    region: Option[String] = None,
    isDefault: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.VpcLookupOptions =
    (new software.amazon.awscdk.services.ec2.VpcLookupOptions.Builder)
      .vpcName(vpcName.orNull)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .subnetGroupNameTag(subnetGroupNameTag.orNull)
      .region(region.orNull)
      .isDefault(isDefault.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
