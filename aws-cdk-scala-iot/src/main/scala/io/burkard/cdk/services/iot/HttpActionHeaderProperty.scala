package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpActionHeaderProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
