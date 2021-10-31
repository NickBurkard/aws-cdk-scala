package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExecuteCommandLogConfigurationProperty {

  def apply(
    cloudWatchEncryptionEnabled: Option[Boolean] = None,
    s3BucketName: Option[String] = None,
    cloudWatchLogGroupName: Option[String] = None,
    s3EncryptionEnabled: Option[Boolean] = None,
    s3KeyPrefix: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty.Builder)
      .cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3BucketName(s3BucketName.orNull)
      .cloudWatchLogGroupName(cloudWatchLogGroupName.orNull)
      .s3EncryptionEnabled(s3EncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3KeyPrefix(s3KeyPrefix.orNull)
      .build()
}
