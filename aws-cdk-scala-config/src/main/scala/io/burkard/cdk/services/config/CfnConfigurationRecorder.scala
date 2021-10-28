package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigurationRecorder {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    recordingGroup: Option[software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty] = None,
    roleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnConfigurationRecorder =
    software.amazon.awscdk.services.config.CfnConfigurationRecorder.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .recordingGroup(recordingGroup.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
