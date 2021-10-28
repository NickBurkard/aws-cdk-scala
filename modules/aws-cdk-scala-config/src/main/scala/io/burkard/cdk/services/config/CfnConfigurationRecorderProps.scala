package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigurationRecorderProps {

  def apply(
    name: Option[String] = None,
    recordingGroup: Option[software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnConfigurationRecorderProps =
    (new software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder)
      .name(name.orNull)
      .recordingGroup(recordingGroup.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
