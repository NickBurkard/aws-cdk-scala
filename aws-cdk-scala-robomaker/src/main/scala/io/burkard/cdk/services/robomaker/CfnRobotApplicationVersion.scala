package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRobotApplicationVersion {

  def apply(
    internalResourceId: String,
    application: Option[String] = None,
    currentRevisionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion =
    software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion.Builder
      .create(stackCtx, internalResourceId)
      .application(application.orNull)
      .currentRevisionId(currentRevisionId.orNull)
      .build()
}
