package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KMSEncryptionConfigProperty {

  def apply(
    awskmsKeyArn: String
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty.Builder)
      .awskmsKeyArn(awskmsKeyArn)
      .build()
}
