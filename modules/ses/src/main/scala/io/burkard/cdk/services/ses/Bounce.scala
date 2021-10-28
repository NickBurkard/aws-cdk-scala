package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Bounce {

  def apply(
    template: Option[software.amazon.awscdk.services.ses.actions.BounceTemplate] = None,
    sender: Option[String] = None,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.Bounce =
    software.amazon.awscdk.services.ses.actions.Bounce.Builder
      .create()
      .template(template.orNull)
      .sender(sender.orNull)
      .topic(topic.orNull)
      .build()
}