package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConditionProperty {

  def apply(
    key: Option[String] = None,
    `type`: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty =
    (new software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder)
      .key(key.orNull)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
