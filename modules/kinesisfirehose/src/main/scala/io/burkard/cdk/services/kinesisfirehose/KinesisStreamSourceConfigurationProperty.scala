package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisStreamSourceConfigurationProperty {

  def apply(
    kinesisStreamArn: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder)
      .kinesisStreamArn(kinesisStreamArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
