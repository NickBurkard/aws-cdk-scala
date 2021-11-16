package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ActionProperty {

  def apply(
    bucketName: String,
    objectKeyPrefix: Option[String] = None,
    topicArn: Option[String] = None,
    kmsKeyArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty.Builder)
      .bucketName(bucketName)
      .objectKeyPrefix(objectKeyPrefix.orNull)
      .topicArn(topicArn.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .build()
}
