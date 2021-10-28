package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KinesisStreamConfigProperty {

  def apply(
    roleArn: Option[String] = None,
    streamArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty.Builder)
      .roleArn(roleArn.orNull)
      .streamArn(streamArn.orNull)
      .build()
}
