package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisStreamSourceConfigurationProperty {

  def apply(
    kinesisStreamArn: String,
    roleArn: String
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder)
      .kinesisStreamArn(kinesisStreamArn)
      .roleArn(roleArn)
      .build()
}
