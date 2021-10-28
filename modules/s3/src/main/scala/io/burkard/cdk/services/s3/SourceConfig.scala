package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SourceConfig {

  def apply(
    zipObjectKey: Option[String] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None
  ): software.amazon.awscdk.services.s3.deployment.SourceConfig =
    (new software.amazon.awscdk.services.s3.deployment.SourceConfig.Builder)
      .zipObjectKey(zipObjectKey.orNull)
      .bucket(bucket.orNull)
      .build()
}