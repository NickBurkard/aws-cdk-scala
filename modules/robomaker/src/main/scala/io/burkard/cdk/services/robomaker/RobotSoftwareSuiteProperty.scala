package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RobotSoftwareSuiteProperty {

  def apply(
    name: String,
    version: String
  ): software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty =
    (new software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder)
      .name(name)
      .version(version)
      .build()
}
