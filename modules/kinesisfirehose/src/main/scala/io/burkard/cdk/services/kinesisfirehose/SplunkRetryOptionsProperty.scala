package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SplunkRetryOptionsProperty {

  def apply(
    durationInSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty.Builder)
      .durationInSeconds(durationInSeconds.orNull)
      .build()
}
