package io.burkard.cdk.services.robomaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSimulationApplication {

  def apply(
    internalResourceId: String,
    robotSoftwareSuite: Option[software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty] = None,
    name: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    simulationSoftwareSuite: Option[software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty] = None,
    environment: Option[String] = None,
    sources: Option[List[_]] = None,
    currentRevisionId: Option[String] = None,
    renderingEngine: Option[software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.robomaker.CfnSimulationApplication =
    software.amazon.awscdk.services.robomaker.CfnSimulationApplication.Builder
      .create(stackCtx, internalResourceId)
      .robotSoftwareSuite(robotSoftwareSuite.orNull)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .simulationSoftwareSuite(simulationSoftwareSuite.orNull)
      .environment(environment.orNull)
      .sources(sources.map(_.asJava).orNull)
      .currentRevisionId(currentRevisionId.orNull)
      .renderingEngine(renderingEngine.orNull)
      .build()
}
