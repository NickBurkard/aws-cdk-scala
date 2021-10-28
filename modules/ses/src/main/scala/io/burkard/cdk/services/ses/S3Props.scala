package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3Props {

  def apply(
    objectKeyPrefix: Option[String] = None,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.S3Props =
    (new software.amazon.awscdk.services.ses.actions.S3Props.Builder)
      .objectKeyPrefix(objectKeyPrefix.orNull)
      .kmsKey(kmsKey.orNull)
      .bucket(bucket.orNull)
      .topic(topic.orNull)
      .build()
}
