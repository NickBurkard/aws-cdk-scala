package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LaunchTemplateTagSpecificationProperty {

  def apply(
    resourceType: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty.Builder)
      .resourceType(resourceType.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
