package io.burkard.cdk.services.robomaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRobotApplication {

  def apply(
    internalResourceId: String,
    robotSoftwareSuite: Option[software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty] = None,
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    currentRevisionId: Option[String] = None,
    sources: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.robomaker.CfnRobotApplication =
    software.amazon.awscdk.services.robomaker.CfnRobotApplication.Builder
      .create(stackCtx, internalResourceId)
      .robotSoftwareSuite(robotSoftwareSuite.orNull)
      .name(name.orNull)
      .tags(tags.orNull)
      .currentRevisionId(currentRevisionId.orNull)
      .sources(sources.map(_.asJava).orNull)
      .build()
}
