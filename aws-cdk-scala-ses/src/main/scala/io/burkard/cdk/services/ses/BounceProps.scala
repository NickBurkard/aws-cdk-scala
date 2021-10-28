package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BounceProps {

  def apply(
    template: Option[software.amazon.awscdk.services.ses.actions.BounceTemplate] = None,
    sender: Option[String] = None,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.BounceProps =
    (new software.amazon.awscdk.services.ses.actions.BounceProps.Builder)
      .template(template.orNull)
      .sender(sender.orNull)
      .topic(topic.orNull)
      .build()
}
