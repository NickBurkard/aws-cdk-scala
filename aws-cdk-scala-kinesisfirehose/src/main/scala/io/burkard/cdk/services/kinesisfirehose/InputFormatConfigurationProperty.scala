package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputFormatConfigurationProperty {

  def apply(
    deserializer: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty.Builder)
      .deserializer(deserializer.orNull)
      .build()
}
