package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpEndpointCommonAttributeProperty {

  def apply(
    attributeValue: String,
    attributeName: String
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty.Builder)
      .attributeValue(attributeValue)
      .attributeName(attributeName)
      .build()
}
