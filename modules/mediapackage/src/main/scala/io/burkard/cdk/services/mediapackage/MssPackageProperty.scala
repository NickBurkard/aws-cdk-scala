package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MssPackageProperty {

  def apply(
    streamSelection: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty] = None,
    encryption: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty] = None,
    manifestWindowSeconds: Option[Number] = None,
    segmentDurationSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty.Builder)
      .streamSelection(streamSelection.orNull)
      .encryption(encryption.orNull)
      .manifestWindowSeconds(manifestWindowSeconds.orNull)
      .segmentDurationSeconds(segmentDurationSeconds.orNull)
      .build()
}
