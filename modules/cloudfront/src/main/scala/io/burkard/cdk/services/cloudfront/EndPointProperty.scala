package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndPointProperty {

  def apply(
    streamType: String,
    kinesisStreamConfig: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty
  ): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty.Builder)
      .streamType(streamType)
      .kinesisStreamConfig(kinesisStreamConfig)
      .build()
}
