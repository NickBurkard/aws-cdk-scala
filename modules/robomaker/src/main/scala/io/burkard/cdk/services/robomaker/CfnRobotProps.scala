package io.burkard.cdk.services.robomaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRobotProps {

  def apply(
    greengrassGroupId: String,
    architecture: String,
    name: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    fleet: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnRobotProps =
    (new software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder)
      .greengrassGroupId(greengrassGroupId)
      .architecture(architecture)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .fleet(fleet.orNull)
      .build()
}
