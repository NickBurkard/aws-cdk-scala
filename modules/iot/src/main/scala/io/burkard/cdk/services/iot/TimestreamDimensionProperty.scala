package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TimestreamDimensionProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}