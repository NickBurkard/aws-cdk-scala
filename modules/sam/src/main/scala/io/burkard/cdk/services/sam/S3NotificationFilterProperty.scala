package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3NotificationFilterProperty {

  def apply(
    s3Key: Option[software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty.Builder)
      .s3Key(s3Key.orNull)
      .build()
}