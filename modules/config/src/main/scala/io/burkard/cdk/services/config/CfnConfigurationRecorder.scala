package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationRecorder {

  def apply(
    internalResourceId: String,
    roleArn: String,
    name: Option[String] = None,
    recordingGroup: Option[software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnConfigurationRecorder =
    software.amazon.awscdk.services.config.CfnConfigurationRecorder.Builder
      .create(stackCtx, internalResourceId)
      .roleArn(roleArn)
      .name(name.orNull)
      .recordingGroup(recordingGroup.orNull)
      .build()
}
