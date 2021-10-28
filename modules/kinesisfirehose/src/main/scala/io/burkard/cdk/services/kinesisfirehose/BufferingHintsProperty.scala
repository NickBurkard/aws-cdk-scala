package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BufferingHintsProperty {

  def apply(
    sizeInMBs: Option[Number] = None,
    intervalInSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.Builder)
      .sizeInMBs(sizeInMBs.orNull)
      .intervalInSeconds(intervalInSeconds.orNull)
      .build()
}
