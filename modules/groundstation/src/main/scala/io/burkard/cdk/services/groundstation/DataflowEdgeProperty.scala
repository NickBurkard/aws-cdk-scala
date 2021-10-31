package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataflowEdgeProperty {

  def apply(
    source: Option[String] = None,
    destination: Option[String] = None
  ): software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty =
    (new software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty.Builder)
      .source(source.orNull)
      .destination(destination.orNull)
      .build()
}
