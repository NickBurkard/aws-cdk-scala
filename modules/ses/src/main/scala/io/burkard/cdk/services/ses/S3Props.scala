package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3Props {

  def apply(
    bucket: software.amazon.awscdk.services.s3.IBucket,
    objectKeyPrefix: Option[String] = None,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.S3Props =
    (new software.amazon.awscdk.services.ses.actions.S3Props.Builder)
      .bucket(bucket)
      .objectKeyPrefix(objectKeyPrefix.orNull)
      .kmsKey(kmsKey.orNull)
      .topic(topic.orNull)
      .build()
}
