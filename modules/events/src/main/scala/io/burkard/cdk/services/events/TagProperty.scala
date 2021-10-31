package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
