package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRobotApplicationVersionProps {

  def apply(
    application: Option[String] = None,
    currentRevisionId: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps =
    (new software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps.Builder)
      .application(application.orNull)
      .currentRevisionId(currentRevisionId.orNull)
      .build()
}
