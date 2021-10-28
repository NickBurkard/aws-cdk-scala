package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RawSettingsProperty {

  def apply: software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty.Builder)
      
      .build()
}
