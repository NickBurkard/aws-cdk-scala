package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VideoSelectorPidProperty {

  def apply(
    pid: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty.Builder)
      .pid(pid.orNull)
      .build()
}
