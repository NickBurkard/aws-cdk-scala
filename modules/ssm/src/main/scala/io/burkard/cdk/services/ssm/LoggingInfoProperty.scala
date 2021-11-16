package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingInfoProperty {

  def apply(
    s3Bucket: String,
    region: String,
    s3Prefix: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty.Builder)
      .s3Bucket(s3Bucket)
      .region(region)
      .s3Prefix(s3Prefix.orNull)
      .build()
}
