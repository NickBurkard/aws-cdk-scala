package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnsTopicProps {

  def apply(
    message: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None
  ): software.amazon.awscdk.services.events.targets.SnsTopicProps =
    (new software.amazon.awscdk.services.events.targets.SnsTopicProps.Builder)
      .message(message.orNull)
      .build()
}
