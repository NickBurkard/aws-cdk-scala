package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSimulationApplicationVersionProps {

  def apply(
    application: String,
    currentRevisionId: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps =
    (new software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.Builder)
      .application(application)
      .currentRevisionId(currentRevisionId.orNull)
      .build()
}
