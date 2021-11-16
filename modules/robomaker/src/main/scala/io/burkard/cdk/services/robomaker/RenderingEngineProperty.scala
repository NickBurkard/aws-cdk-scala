package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RenderingEngineProperty {

  def apply(
    name: String,
    version: String
  ): software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty =
    (new software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.Builder)
      .name(name)
      .version(version)
      .build()
}
