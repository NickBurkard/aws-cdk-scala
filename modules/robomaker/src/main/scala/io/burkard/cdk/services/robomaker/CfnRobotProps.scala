package io.burkard.cdk.services.robomaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRobotProps {

  def apply(
    name: Option[String] = None,
    greengrassGroupId: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    architecture: Option[String] = None,
    fleet: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnRobotProps =
    (new software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder)
      .name(name.orNull)
      .greengrassGroupId(greengrassGroupId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .architecture(architecture.orNull)
      .fleet(fleet.orNull)
      .build()
}
