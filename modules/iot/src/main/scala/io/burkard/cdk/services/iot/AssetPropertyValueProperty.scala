package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetPropertyValueProperty {

  def apply(
    quality: Option[String] = None,
    timestamp: Option[software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty] = None,
    value: Option[software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty.Builder)
      .quality(quality.orNull)
      .timestamp(timestamp.orNull)
      .value(value.orNull)
      .build()
}
