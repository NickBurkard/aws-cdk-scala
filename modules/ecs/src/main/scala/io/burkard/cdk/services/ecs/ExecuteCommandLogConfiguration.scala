package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExecuteCommandLogConfiguration {

  def apply(
    s3Bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    cloudWatchEncryptionEnabled: Option[Boolean] = None,
    cloudWatchLogGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    s3EncryptionEnabled: Option[Boolean] = None,
    s3KeyPrefix: Option[String] = None
  ): software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration =
    (new software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration.Builder)
      .s3Bucket(s3Bucket.orNull)
      .cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudWatchLogGroup(cloudWatchLogGroup.orNull)
      .s3EncryptionEnabled(s3EncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3KeyPrefix(s3KeyPrefix.orNull)
      .build()
}
