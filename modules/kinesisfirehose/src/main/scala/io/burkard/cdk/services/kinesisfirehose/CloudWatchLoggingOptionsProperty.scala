package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudWatchLoggingOptionsProperty {

  def apply(
    enabled: Option[Boolean] = None,
    logStreamName: Option[String] = None,
    logGroupName: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .logStreamName(logStreamName.orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}
