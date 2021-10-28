package io.burkard.cdk.services.mediaconvert

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccelerationSettingsProperty {

  def apply(
    mode: Option[String] = None
  ): software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty =
    (new software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty.Builder)
      .mode(mode.orNull)
      .build()
}
