package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSimulationApplicationVersion {

  def apply(
    internalResourceId: String,
    application: Option[String] = None,
    currentRevisionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion =
    software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion.Builder
      .create(stackCtx, internalResourceId)
      .application(application.orNull)
      .currentRevisionId(currentRevisionId.orNull)
      .build()
}
