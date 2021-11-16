package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetPropertyValueProperty {

  def apply(
    timestamp: software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty,
    value: software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty,
    quality: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty.Builder)
      .timestamp(timestamp)
      .value(value)
      .quality(quality.orNull)
      .build()
}
