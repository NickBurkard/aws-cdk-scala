package io.burkard.cdk.services.robomaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRobot {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    greengrassGroupId: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    architecture: Option[String] = None,
    fleet: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.robomaker.CfnRobot =
    software.amazon.awscdk.services.robomaker.CfnRobot.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .greengrassGroupId(greengrassGroupId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .architecture(architecture.orNull)
      .fleet(fleet.orNull)
      .build()
}
