package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3 {

  def apply(
    bucket: software.amazon.awscdk.services.s3.IBucket,
    objectKeyPrefix: Option[String] = None,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.S3 =
    software.amazon.awscdk.services.ses.actions.S3.Builder
      .create()
      .bucket(bucket)
      .objectKeyPrefix(objectKeyPrefix.orNull)
      .kmsKey(kmsKey.orNull)
      .topic(topic.orNull)
      .build()
}
