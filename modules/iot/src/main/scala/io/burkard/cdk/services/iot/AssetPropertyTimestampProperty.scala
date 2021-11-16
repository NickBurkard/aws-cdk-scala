package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetPropertyTimestampProperty {

  def apply(
    timeInSeconds: String,
    offsetInNanos: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty.Builder)
      .timeInSeconds(timeInSeconds)
      .offsetInNanos(offsetInNanos.orNull)
      .build()
}
