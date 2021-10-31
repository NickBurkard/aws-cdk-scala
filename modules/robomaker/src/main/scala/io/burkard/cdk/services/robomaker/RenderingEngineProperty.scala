package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RenderingEngineProperty {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty =
    (new software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .build()
}
