package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeliveryStreamEncryptionConfigurationInputProperty {

  def apply(
    keyType: Option[String] = None,
    keyArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.Builder)
      .keyType(keyType.orNull)
      .keyArn(keyArn.orNull)
      .build()
}
