package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingConfigurationProperty {

  def apply(
    logFilePrefix: Option[String] = None,
    destinationBucketName: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.Builder)
      .logFilePrefix(logFilePrefix.orNull)
      .destinationBucketName(destinationBucketName.orNull)
      .build()
}
