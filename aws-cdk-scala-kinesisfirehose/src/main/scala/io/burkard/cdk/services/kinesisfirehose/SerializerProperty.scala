package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SerializerProperty {

  def apply(
    parquetSerDe: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty] = None,
    orcSerDe: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty.Builder)
      .parquetSerDe(parquetSerDe.orNull)
      .orcSerDe(orcSerDe.orNull)
      .build()
}
