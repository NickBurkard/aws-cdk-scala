package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnRule.TagProperty =
    (new software.amazon.awscdk.services.events.CfnRule.TagProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
