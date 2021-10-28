package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssetPropertyVariantProperty {

  def apply(
    doubleValue: Option[String] = None,
    integerValue: Option[String] = None,
    stringValue: Option[String] = None,
    booleanValue: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty.Builder)
      .doubleValue(doubleValue.orNull)
      .integerValue(integerValue.orNull)
      .stringValue(stringValue.orNull)
      .booleanValue(booleanValue.orNull)
      .build()
}
