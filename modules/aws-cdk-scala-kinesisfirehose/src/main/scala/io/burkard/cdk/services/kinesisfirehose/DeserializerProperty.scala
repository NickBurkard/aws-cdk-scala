package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeserializerProperty {

  def apply(
    openXJsonSerDe: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty] = None,
    hiveJsonSerDe: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty.Builder)
      .openXJsonSerDe(openXJsonSerDe.orNull)
      .hiveJsonSerDe(hiveJsonSerDe.orNull)
      .build()
}
