package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3RecordingConfigProperty {

  def apply(
    prefix: Option[String] = None,
    roleArn: Option[String] = None,
    bucketArn: Option[String] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty.Builder)
      .prefix(prefix.orNull)
      .roleArn(roleArn.orNull)
      .bucketArn(bucketArn.orNull)
      .build()
}
