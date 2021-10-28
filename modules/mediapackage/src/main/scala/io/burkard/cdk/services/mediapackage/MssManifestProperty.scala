package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MssManifestProperty {

  def apply(
    streamSelection: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty] = None,
    manifestName: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty.Builder)
      .streamSelection(streamSelection.orNull)
      .manifestName(manifestName.orNull)
      .build()
}
