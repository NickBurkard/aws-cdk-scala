package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AribSourceSettingsProperty {

  def apply: software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty.Builder)
      
      .build()
}
