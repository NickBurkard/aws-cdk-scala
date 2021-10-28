package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SourceBundleProperty {

  def apply(
    s3Bucket: Option[String] = None,
    s3Key: Option[String] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.Builder)
      .s3Bucket(s3Bucket.orNull)
      .s3Key(s3Key.orNull)
      .build()
}
