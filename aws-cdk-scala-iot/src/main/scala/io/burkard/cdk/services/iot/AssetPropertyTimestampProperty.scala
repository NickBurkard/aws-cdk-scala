package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssetPropertyTimestampProperty {

  def apply(
    offsetInNanos: Option[String] = None,
    timeInSeconds: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty.Builder)
      .offsetInNanos(offsetInNanos.orNull)
      .timeInSeconds(timeInSeconds.orNull)
      .build()
}
