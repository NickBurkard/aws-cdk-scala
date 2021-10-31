package io.burkard.cdk.services.mediaconvert

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccelerationSettingsProperty {

  def apply(
    mode: Option[String] = None
  ): software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty =
    (new software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty.Builder)
      .mode(mode.orNull)
      .build()
}
