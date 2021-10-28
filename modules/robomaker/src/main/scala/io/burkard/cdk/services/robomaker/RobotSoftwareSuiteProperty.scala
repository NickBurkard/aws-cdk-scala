package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RobotSoftwareSuiteProperty {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty =
    (new software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .build()
}
