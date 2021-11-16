package io.burkard.cdk.services.robomaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRobot {

  def apply(
    internalResourceId: String,
    greengrassGroupId: String,
    architecture: String,
    name: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    fleet: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.robomaker.CfnRobot =
    software.amazon.awscdk.services.robomaker.CfnRobot.Builder
      .create(stackCtx, internalResourceId)
      .greengrassGroupId(greengrassGroupId)
      .architecture(architecture)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .fleet(fleet.orNull)
      .build()
}
