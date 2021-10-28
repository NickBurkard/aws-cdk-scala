package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpEndpointCommonAttributeProperty {

  def apply(
    attributeValue: Option[String] = None,
    attributeName: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty.Builder)
      .attributeValue(attributeValue.orNull)
      .attributeName(attributeName.orNull)
      .build()
}
