package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PassThroughSettingsProperty {

  def apply: software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty.Builder)
      
      .build()
}
