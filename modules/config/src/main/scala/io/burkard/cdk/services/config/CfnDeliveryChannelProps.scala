package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeliveryChannelProps {

  def apply(
    configSnapshotDeliveryProperties: Option[software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty] = None,
    s3BucketName: Option[String] = None,
    snsTopicArn: Option[String] = None,
    s3KeyPrefix: Option[String] = None,
    name: Option[String] = None,
    s3KmsKeyArn: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnDeliveryChannelProps =
    (new software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder)
      .configSnapshotDeliveryProperties(configSnapshotDeliveryProperties.orNull)
      .s3BucketName(s3BucketName.orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .s3KeyPrefix(s3KeyPrefix.orNull)
      .name(name.orNull)
      .s3KmsKeyArn(s3KmsKeyArn.orNull)
      .build()
}
