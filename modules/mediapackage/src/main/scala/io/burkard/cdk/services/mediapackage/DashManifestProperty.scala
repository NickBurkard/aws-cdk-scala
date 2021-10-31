package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DashManifestProperty {

  def apply(
    streamSelection: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty] = None,
    minBufferTimeSeconds: Option[Number] = None,
    profile: Option[String] = None,
    manifestLayout: Option[String] = None,
    manifestName: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty.Builder)
      .streamSelection(streamSelection.orNull)
      .minBufferTimeSeconds(minBufferTimeSeconds.orNull)
      .profile(profile.orNull)
      .manifestLayout(manifestLayout.orNull)
      .manifestName(manifestName.orNull)
      .build()
}
