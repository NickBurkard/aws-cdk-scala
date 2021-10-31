package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Rec709SettingsProperty {

  def apply: software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty.Builder)
      
      .build()
}
