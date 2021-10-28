package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MediaPackageGroupSettingsProperty {

  def apply(
    destination: Option[software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty.Builder)
      .destination(destination.orNull)
      .build()
}
