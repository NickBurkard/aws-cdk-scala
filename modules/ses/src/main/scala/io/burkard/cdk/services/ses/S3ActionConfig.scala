package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ActionConfig {

  def apply(
    objectKeyPrefix: Option[String] = None,
    topicArn: Option[String] = None,
    kmsKeyArn: Option[String] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.ses.S3ActionConfig =
    (new software.amazon.awscdk.services.ses.S3ActionConfig.Builder)
      .objectKeyPrefix(objectKeyPrefix.orNull)
      .topicArn(topicArn.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
