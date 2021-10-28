package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DvbSubSourceSettingsProperty {

  def apply(
    pid: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty.Builder)
      .pid(pid.orNull)
      .build()
}
