package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisStreamConfigProperty {

  def apply(
    roleArn: String,
    streamArn: String
  ): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty.Builder)
      .roleArn(roleArn)
      .streamArn(streamArn)
      .build()
}
