package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VersioningConfigurationProperty {

  def apply(
    status: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty.Builder)
      .status(status.orNull)
      .build()
}
