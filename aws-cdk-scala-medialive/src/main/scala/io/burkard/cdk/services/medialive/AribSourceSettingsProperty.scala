package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AribSourceSettingsProperty {

  def apply: software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty.Builder)
      
      .build()
}
