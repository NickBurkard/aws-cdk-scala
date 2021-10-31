package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PassThroughSettingsProperty {

  def apply: software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty.Builder)
      
      .build()
}
