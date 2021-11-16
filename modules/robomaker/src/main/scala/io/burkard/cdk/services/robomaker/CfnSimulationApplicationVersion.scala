package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSimulationApplicationVersion {

  def apply(
    internalResourceId: String,
    application: String,
    currentRevisionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion =
    software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion.Builder
      .create(stackCtx, internalResourceId)
      .application(application)
      .currentRevisionId(currentRevisionId.orNull)
      .build()
}
