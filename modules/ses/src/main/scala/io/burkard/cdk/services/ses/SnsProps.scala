package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnsProps {

  def apply(
    encoding: Option[software.amazon.awscdk.services.ses.actions.EmailEncoding] = None,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.SnsProps =
    (new software.amazon.awscdk.services.ses.actions.SnsProps.Builder)
      .encoding(encoding.orNull)
      .topic(topic.orNull)
      .build()
}
