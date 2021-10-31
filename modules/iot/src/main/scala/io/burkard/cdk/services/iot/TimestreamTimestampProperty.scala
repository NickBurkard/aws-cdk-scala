package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimestreamTimestampProperty {

  def apply(
    unit: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty.Builder)
      .unit(unit.orNull)
      .value(value.orNull)
      .build()
}
