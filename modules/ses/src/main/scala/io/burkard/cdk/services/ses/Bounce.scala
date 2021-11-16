package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Bounce {

  def apply(
    template: software.amazon.awscdk.services.ses.actions.BounceTemplate,
    sender: String,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.Bounce =
    software.amazon.awscdk.services.ses.actions.Bounce.Builder
      .create()
      .template(template)
      .sender(sender)
      .topic(topic.orNull)
      .build()
}
