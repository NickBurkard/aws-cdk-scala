package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsManifestProperty {

  def apply(
    includeIframeOnlyStream: Option[Boolean] = None,
    streamSelection: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty] = None,
    adMarkers: Option[String] = None,
    programDateTimeIntervalSeconds: Option[Number] = None,
    repeatExtXKey: Option[Boolean] = None,
    manifestName: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty.Builder)
      .includeIframeOnlyStream(includeIframeOnlyStream.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .streamSelection(streamSelection.orNull)
      .adMarkers(adMarkers.orNull)
      .programDateTimeIntervalSeconds(programDateTimeIntervalSeconds.orNull)
      .repeatExtXKey(repeatExtXKey.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .manifestName(manifestName.orNull)
      .build()
}
