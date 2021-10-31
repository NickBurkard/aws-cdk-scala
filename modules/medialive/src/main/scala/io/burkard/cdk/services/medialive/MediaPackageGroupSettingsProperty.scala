package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MediaPackageGroupSettingsProperty {

  def apply(
    destination: Option[software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty.Builder)
      .destination(destination.orNull)
      .build()
}
