package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRobotApplicationVersionProps {

  def apply(
    application: String,
    currentRevisionId: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps =
    (new software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps.Builder)
      .application(application)
      .currentRevisionId(currentRevisionId.orNull)
      .build()
}
