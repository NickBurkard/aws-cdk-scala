package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRobotApplicationVersion {

  def apply(
    internalResourceId: String,
    application: String,
    currentRevisionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion =
    software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion.Builder
      .create(stackCtx, internalResourceId)
      .application(application)
      .currentRevisionId(currentRevisionId.orNull)
      .build()
}
