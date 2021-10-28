package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AudioNormalizationSettingsProperty {

  def apply(
    algorithmControl: Option[String] = None,
    algorithm: Option[String] = None,
    targetLkfs: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty.Builder)
      .algorithmControl(algorithmControl.orNull)
      .algorithm(algorithm.orNull)
      .targetLkfs(targetLkfs.orNull)
      .build()
}
