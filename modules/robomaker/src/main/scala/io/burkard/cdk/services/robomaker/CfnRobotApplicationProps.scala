package io.burkard.cdk.services.robomaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRobotApplicationProps {

  def apply(
    robotSoftwareSuite: software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty,
    sources: List[_],
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    currentRevisionId: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps =
    (new software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder)
      .robotSoftwareSuite(robotSoftwareSuite)
      .sources(sources.asJava)
      .name(name.orNull)
      .tags(tags.orNull)
      .currentRevisionId(currentRevisionId.orNull)
      .build()
}
