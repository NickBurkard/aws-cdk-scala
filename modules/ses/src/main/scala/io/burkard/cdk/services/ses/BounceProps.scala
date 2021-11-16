package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BounceProps {

  def apply(
    template: software.amazon.awscdk.services.ses.actions.BounceTemplate,
    sender: String,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.BounceProps =
    (new software.amazon.awscdk.services.ses.actions.BounceProps.Builder)
      .template(template)
      .sender(sender)
      .topic(topic.orNull)
      .build()
}
