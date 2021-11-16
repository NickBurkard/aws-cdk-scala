package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeliveryChannelProps {

  def apply(
    s3BucketName: String,
    configSnapshotDeliveryProperties: Option[software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty] = None,
    snsTopicArn: Option[String] = None,
    s3KeyPrefix: Option[String] = None,
    name: Option[String] = None,
    s3KmsKeyArn: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnDeliveryChannelProps =
    (new software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder)
      .s3BucketName(s3BucketName)
      .configSnapshotDeliveryProperties(configSnapshotDeliveryProperties.orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .s3KeyPrefix(s3KeyPrefix.orNull)
      .name(name.orNull)
      .s3KmsKeyArn(s3KmsKeyArn.orNull)
      .build()
}
