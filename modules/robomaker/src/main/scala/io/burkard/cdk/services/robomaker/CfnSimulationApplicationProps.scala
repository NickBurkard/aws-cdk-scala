package io.burkard.cdk.services.robomaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSimulationApplicationProps {

  def apply(
    robotSoftwareSuite: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty,
    simulationSoftwareSuite: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty,
    name: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    environment: Option[String] = None,
    sources: Option[List[_]] = None,
    currentRevisionId: Option[String] = None,
    renderingEngine: Option[software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty] = None
  ): software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps =
    (new software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder)
      .robotSoftwareSuite(robotSoftwareSuite)
      .simulationSoftwareSuite(simulationSoftwareSuite)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .environment(environment.orNull)
      .sources(sources.map(_.asJava).orNull)
      .currentRevisionId(currentRevisionId.orNull)
      .renderingEngine(renderingEngine.orNull)
      .build()
}
