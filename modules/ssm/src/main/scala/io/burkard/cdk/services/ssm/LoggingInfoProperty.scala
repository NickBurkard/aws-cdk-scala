package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingInfoProperty {

  def apply(
    s3Bucket: Option[String] = None,
    s3Prefix: Option[String] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty.Builder)
      .s3Bucket(s3Bucket.orNull)
      .s3Prefix(s3Prefix.orNull)
      .region(region.orNull)
      .build()
}
