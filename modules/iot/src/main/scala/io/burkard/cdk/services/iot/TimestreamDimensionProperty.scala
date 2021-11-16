package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimestreamDimensionProperty {

  def apply(
    name: String,
    value: String
  ): software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty.Builder)
      .name(name)
      .value(value)
      .build()
}
