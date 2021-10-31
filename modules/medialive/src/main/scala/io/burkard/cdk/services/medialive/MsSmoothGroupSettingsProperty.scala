package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MsSmoothGroupSettingsProperty {

  def apply(
    fragmentLength: Option[Number] = None,
    connectionRetryInterval: Option[Number] = None,
    eventStopBehavior: Option[String] = None,
    numRetries: Option[Number] = None,
    inputLossAction: Option[String] = None,
    certificateMode: Option[String] = None,
    eventId: Option[String] = None,
    sparseTrackType: Option[String] = None,
    sendDelayMs: Option[Number] = None,
    acquisitionPointId: Option[String] = None,
    destination: Option[software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty] = None,
    audioOnlyTimecodeControl: Option[String] = None,
    segmentationMode: Option[String] = None,
    timestampOffset: Option[String] = None,
    restartDelay: Option[Number] = None,
    timestampOffsetMode: Option[String] = None,
    eventIdMode: Option[String] = None,
    filecacheDuration: Option[Number] = None,
    streamManifestBehavior: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty.Builder)
      .fragmentLength(fragmentLength.orNull)
      .connectionRetryInterval(connectionRetryInterval.orNull)
      .eventStopBehavior(eventStopBehavior.orNull)
      .numRetries(numRetries.orNull)
      .inputLossAction(inputLossAction.orNull)
      .certificateMode(certificateMode.orNull)
      .eventId(eventId.orNull)
      .sparseTrackType(sparseTrackType.orNull)
      .sendDelayMs(sendDelayMs.orNull)
      .acquisitionPointId(acquisitionPointId.orNull)
      .destination(destination.orNull)
      .audioOnlyTimecodeControl(audioOnlyTimecodeControl.orNull)
      .segmentationMode(segmentationMode.orNull)
      .timestampOffset(timestampOffset.orNull)
      .restartDelay(restartDelay.orNull)
      .timestampOffsetMode(timestampOffsetMode.orNull)
      .eventIdMode(eventIdMode.orNull)
      .filecacheDuration(filecacheDuration.orNull)
      .streamManifestBehavior(streamManifestBehavior.orNull)
      .build()
}
