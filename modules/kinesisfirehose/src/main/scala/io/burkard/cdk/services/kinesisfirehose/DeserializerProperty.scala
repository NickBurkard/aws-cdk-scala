package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
