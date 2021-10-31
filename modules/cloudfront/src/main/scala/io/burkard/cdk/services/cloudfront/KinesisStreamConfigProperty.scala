package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
