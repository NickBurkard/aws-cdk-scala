package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSimulationApplicationVersionProps {

  def apply(
    application: Option[String] = None,
    currentRevisionId: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps =
    (new software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.Builder)
      .application(application.orNull)
      .currentRevisionId(currentRevisionId.orNull)
      .build()
}
