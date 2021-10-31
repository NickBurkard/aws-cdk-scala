package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnsTopic {

  def apply(
    topic: software.amazon.awscdk.services.sns.ITopic,
    message: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None
  ): software.amazon.awscdk.services.events.targets.SnsTopic =
    software.amazon.awscdk.services.events.targets.SnsTopic.Builder
      .create(topic)
      .message(message.orNull)
      .build()
}
