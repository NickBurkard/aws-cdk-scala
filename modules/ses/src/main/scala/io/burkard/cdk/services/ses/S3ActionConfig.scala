package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ActionConfig {

  def apply(
    bucketName: String,
    objectKeyPrefix: Option[String] = None,
    topicArn: Option[String] = None,
    kmsKeyArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.S3ActionConfig =
    (new software.amazon.awscdk.services.ses.S3ActionConfig.Builder)
      .bucketName(bucketName)
      .objectKeyPrefix(objectKeyPrefix.orNull)
      .topicArn(topicArn.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .build()
}
