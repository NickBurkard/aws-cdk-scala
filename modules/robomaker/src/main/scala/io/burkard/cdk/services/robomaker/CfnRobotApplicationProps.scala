package io.burkard.cdk.services.robomaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRobotApplicationProps {

  def apply(
    robotSoftwareSuite: Option[software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty] = None,
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    currentRevisionId: Option[String] = None,
    sources: Option[List[_]] = None
  ): software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps =
    (new software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder)
      .robotSoftwareSuite(robotSoftwareSuite.orNull)
      .name(name.orNull)
      .tags(tags.orNull)
      .currentRevisionId(currentRevisionId.orNull)
      .sources(sources.map(_.asJava).orNull)
      .build()
}
