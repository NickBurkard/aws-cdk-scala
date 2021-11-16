package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpActionHeaderProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
