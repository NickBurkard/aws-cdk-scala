package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndPointProperty {

  def apply(
    streamType: Option[String] = None,
    kinesisStreamConfig: Option[software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty.Builder)
      .streamType(streamType.orNull)
      .kinesisStreamConfig(kinesisStreamConfig.orNull)
      .build()
}
