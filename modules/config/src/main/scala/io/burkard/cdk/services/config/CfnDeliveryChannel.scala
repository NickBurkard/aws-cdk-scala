package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeliveryChannel {

  def apply(
    internalResourceId: String,
    s3BucketName: String,
    configSnapshotDeliveryProperties: Option[software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty] = None,
    snsTopicArn: Option[String] = None,
    s3KeyPrefix: Option[String] = None,
    name: Option[String] = None,
    s3KmsKeyArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnDeliveryChannel =
    software.amazon.awscdk.services.config.CfnDeliveryChannel.Builder
      .create(stackCtx, internalResourceId)
      .s3BucketName(s3BucketName)
      .configSnapshotDeliveryProperties(configSnapshotDeliveryProperties.orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .s3KeyPrefix(s3KeyPrefix.orNull)
      .name(name.orNull)
      .s3KmsKeyArn(s3KmsKeyArn.orNull)
      .build()
}
